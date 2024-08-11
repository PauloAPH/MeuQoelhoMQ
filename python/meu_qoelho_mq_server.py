# Copyright 2015 gRPC authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""The Python implementation of the gRPC MeuCoelhoMQS server."""

from concurrent import futures

import grpc
import hashlib
import logging

from database import resources as RS 
from protos import meu_qoelho_mq_pb2
from protos import meu_qoelho_mq_pb2_grpc

#Credito hash_value ChatGPT
def hash_value(value):
    if not isinstance(value, bytes):
        value = str(value).encode('utf-8')
    hash_object = hashlib.sha256()
    hash_object.update(value)
    return hash_object.hexdigest()

def login(credential):
    user = credential.id
    user_password = hash_value(credential.password)
    password_hash = RS.consult_credentials(user) 
    return user_password == password_hash


class MeuQoelhoMQServicer(meu_qoelho_mq_pb2_grpc.MeuQoelhoMQServicer):
    """Provides methods that implement functionality of MeuCoelhoMQS server."""

    def __init__(self):
        print("Server runnig: Hello World!")

    def Register(self, request, context):
        password_hash = hash_value(request.password)
        res = RS.create_user(request.id, password_hash)
        if res["status"] == 0:
            response = "Usuario criado com sucesso"
        else:
            response = "Usuario ja existe"
        return meu_qoelho_mq_pb2.Response(response = response, status = res["status"])

    def CreateChannel(self, request, context):
        tipo = meu_qoelho_mq_pb2.Tipo.Name(request.tipo)
        res = RS.insert_channel(request.name, tipo)
        if res["status"] == 0:
            response = "Request recebida " + request.name + " do tipo " + tipo
        else:
            response = "Erro ao criar canal."
        return meu_qoelho_mq_pb2.Response(response = response, status = res["status"])
    
    def DeleteChannel(self, request, context):
        res = RS.delete_channel(request.name)
        if res["status"] == 0:
            response = request.name + " deletado"
        else:
            response = "Erro ao deletar canal."
        return meu_qoelho_mq_pb2.Response(response = response, status = res["status"])

    def ListChannels(self, request, context):
        print("Requisição de lista de canais recebida")
        channels = RS.list_channels()
        for channel in channels:
            response = meu_qoelho_mq_pb2.Channels(name = channel[1], tipo = channel[2])
            yield response

    def PublishMessage(self, request, context):
        subs = RS.list_subscribers_to_channels(request.channel)
        subs = [t[0] for t in subs]
        res = RS.insert_message(request.data, request.channel, subs)
        if res["status"] == 0:
            response = "Mensagem Publicada na fila " + request.channel
        else:
            response = "Erro ao publicar no canal."
        return meu_qoelho_mq_pb2.Response(response = response)
    
    def SubscribeToChannel(self, request, context):
        if login(request.credentials):
            channel_map = RS.consult_channel(request.channel)
            if channel_map["status"] == 0 and channel_map["channel"] != None:
                subs = RS.list_subscribers_to_channels(request.channel)
                subs_list = [sub[0] for sub in subs]
                if not subs_list:
                    insert_res = RS.insert_subscribers(request.credentials.id , request.channel)
                    update_res = RS.update_subscribers_in_messages([request.credentials.id], request.channel)
                    if insert_res["status"] == 0 and update_res["status"] == 0:
                        response = "Inscrito na fila " + request.channel + " herdando mensagens"
                        status = 0
                    else:
                        response = "Erro na inscrição"
                        status = 1
                elif request.credentials.id in subs_list:
                    response = "Já cadastrado em " + request.channel
                    status = 0
                else:
                    insert_res = RS.insert_subscribers(request.credentials.id , request.channel)
                    if insert_res["status"] == 0:
                        response = "Inscrito na fila " + request.channel
                        status = 0
                    else:
                        response = "Erro na inscrição"
                        status = 1
            else:
                response = "Canal não existe"
                status = 1
        else:
            response = "Acess denied, wrong credentials"
            status = 1
        return meu_qoelho_mq_pb2.Response(response = response, status = status)
    
    def ConsultNumberOfMessages(self, request, context):
        if login(request.credentials):
            number_of_messages = RS.consult_number_of_message_in_channel(request.channel)
            return meu_qoelho_mq_pb2.Response(response = str(number_of_messages) )
        else:
            response = "Acess denied, wrong credentials"
        return meu_qoelho_mq_pb2.Response(response = response)
    
    def GetMessageFromChannel(self, request, context):
        if login(request.credentials):
            channel_map = RS.consult_channel(request.channel)
            channel_type = channel_map["channel"][2]
            messages = RS.list_message_in_channel(request.channel)
            for msg in messages:
                id = msg[0]
                res = msg[1]
                subs = msg[3]
                if request.credentials.id in subs:
                    subs.remove(request.credentials.id)
                    if len(subs) == 0 or channel_type == "SIMPLES":
                        print("Mensagem consumida")
                        RS.delete_message(id)
                    else:
                        RS.update_message_subscribers(id, subs)
                    yield meu_qoelho_mq_pb2.Response(response = res)
        else:
            response = "Acess denied, wrong credentials"
            yield meu_qoelho_mq_pb2.Response(response = response)

        
def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    meu_qoelho_mq_pb2_grpc.add_MeuQoelhoMQServicer_to_server(
        MeuQoelhoMQServicer(), server
    )
    server.add_insecure_port("[::]:50051")
    server.start()
    server.wait_for_termination()


if __name__ == "__main__":
    logging.basicConfig()
    serve()
