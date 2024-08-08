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
"""The Python implementation of the gRPC route guide client."""

from __future__ import print_function
from datetime import datetime, timezone

import logging
import random
import time
import grpc

from protos import meu_coelho_mq_pb2
from protos import meu_coelho_mq_pb2_grpc
import resources as RS 

def create_user(stub, id, password):
    user = meu_coelho_mq_pb2.Credentials(id = id, password = password)
    res = stub.Register(user)
    print(res)

def create_channel_request(stub, name, tipo):
    channel = meu_coelho_mq_pb2.Channel()
    channel.name = name
    if tipo == "Simples":
        channel.tipo = meu_coelho_mq_pb2.Tipo.SIMPLES
    elif tipo == "Multiplo":
        channel.tipo = meu_coelho_mq_pb2.Tipo.MULTIPLO
    print(stub.CreateChannel(channel))

def delete_channel_request(stub):
    channel = meu_coelho_mq_pb2.Channel(name = "Canal1", tipo = 1)
    stub.DeleteChannel(channel)

def list_channels(stub):
    channel_out = meu_coelho_mq_pb2.Channel(name = "Canal1", tipo = 1)
    channels = stub.ListChannels(channel_out)
    for channel in channels:
        tipo = meu_coelho_mq_pb2.Tipo.Name(channel.tipo)
        print(channel.name +  " Tipo: " + tipo)

def publish_message(stub, data_in, channel_in):
    msg = meu_coelho_mq_pb2.Message(data = data_in, channel = channel_in)
    res = stub.PublishMessage(msg)

def subscribe_to_channel(stub, cred, channel):
    subs = meu_coelho_mq_pb2.Subscriber(credentials = cred, channel = channel)
    res = stub.SubscribeToChannel(subs)
    print(res)

def consult_messages_in_channel(stub):
    cred = meu_coelho_mq_pb2.Credentials(id = "Paulo", password = "123456")
    sub = meu_coelho_mq_pb2.Subscriber(credentials = cred, channel = "Canal2")
    qtd = stub.ConsultNumberOfMessages(sub)
    print(qtd)

def get_messages_from_subscrition(stub, sub):
    res = stub.GetMessageFromChannel(sub)
    for r in res:
        print(r)

def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = meu_coelho_mq_pb2_grpc.MeuCoelhoMQStub(channel)
        #create_channel_request(stub)
        #delete_channel_request(stub)
        #list_channels(stub)
        #publish_message(stub)
        #subscribe_to_channel(stub)
        #consult_messages_in_channel(stub)
        #create_user(stub)
        #get_messages_from_subscrition(stub)

        


if __name__ == "__main__":
    logging.basicConfig()
    run()
