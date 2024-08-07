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
import logging
import hashlib
import math
import time


import grpc
from protos import meu_coelho_mq_pb2
from protos import meu_coelho_mq_pb2_grpc
import resources as RS 

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


class MeuCoelhoMQServicer(meu_coelho_mq_pb2_grpc.MeuCoelhoMQServicer):
    """Provides methods that implement functionality of MeuCoelhoMQS server."""

    def __init__(self):
        print("Server runnig: Hello World!")

    def Register(self, request, context):
        password_hash = hash_value(request.password)
        RS.create_user(request.id, password_hash)
        response = "Usuario criado com sucesso"
        return meu_coelho_mq_pb2.Response(response = response)

    def CreateChannel(self, request, context):
        match request.tipo:
            case 0:
                response = "Request recebida criando uma fila simples"
                tipo = meu_coelho_mq_pb2.Tipo.Name(request.tipo)
                RS.insert_channel(request.name, tipo)
            case 1:
                response = "Request recebida criando uma fila multipla"
                tipo = meu_coelho_mq_pb2.Tipo.Name(request.tipo)
                RS.insert_channel(request.name, tipo)
        return meu_coelho_mq_pb2.Response(response = response)
    
    def DeleteChannel(self, request, context):
        RS.delete_channel(request.name)
        response = "Fila " + request.name + "deletada"
        return meu_coelho_mq_pb2.Response(response = response)

    def ListChannels(self, request, context):
        channels = RS.list_channels()
        for channel in channels:
            response = meu_coelho_mq_pb2.Channel(name = channel[1], tipo = channel[2])
            yield response

    def PublishMessage(self, request, context):
        response = "Mensagem Publicada na fila" + request.channel
        subs = RS.list_subscribers_to_channels(request.channel)
        subs = [t[0] for t in subs]
        RS.insert_message(request.data, request.channel, subs)
        return meu_coelho_mq_pb2.Response(response = response)
    
    def SubscribeToChannel(self, request, context):
        if login(request.credentials):
            channel_type = RS.consult_channel_type(request.channel)
            subs = RS.consult_subscribers(request.channel)

            if channel_type == "SIMPLES" and subs > 0:
                response = "Acess denied, channel already being taken"
            else: 
                RS.insert_subscribers(request.credentials.id , request.channel)
                response = "Inscrito na fila " + request.channel
        else:
            response = "Acess denied, wrong credentials"
        return meu_coelho_mq_pb2.Response(response = response)
    
    def ConsultNumberOfMessages(self, request, context):
        if login(request.credentials):
            number_of_messages = RS.consult_number_of_message_in_channel(request.channel)
            return meu_coelho_mq_pb2.Response(response = str(number_of_messages) )
        else:
            response = "Acess denied, wrong credentials"
        return meu_coelho_mq_pb2.Response(response = response)
    
    def GetMessageFromChannel(self, request, context):
        if login(request.credentials):
            messages = RS.list_message_in_channel(request.channel)
            for msg in messages:
                id = msg[0]
                res = msg[1]
                subs = msg[3]
                if request.credentials.id in subs:
                    subs.remove(request.credentials.id)
                    if len(subs) == 0:
                        RS.delete_message(id)
                    else:
                        RS.update_message_subscribers(id, subs)
                    yield meu_coelho_mq_pb2.Response(response = res)
        else:
            response = "Acess denied, wrong credentials"
            yield meu_coelho_mq_pb2.Response(response = response)

        
def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    meu_coelho_mq_pb2_grpc.add_MeuCoelhoMQServicer_to_server(
        MeuCoelhoMQServicer(), server
    )
    server.add_insecure_port("[::]:50051")
    server.start()
    server.wait_for_termination()


if __name__ == "__main__":
    logging.basicConfig()
    serve()
