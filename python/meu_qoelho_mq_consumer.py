from __future__ import print_function
from datetime import datetime, timezone


import grpc
import logging
import time

from meu_qoelho_mq_client import Client

from protos import meu_qoelho_mq_pb2
from protos import meu_qoelho_mq_pb2_grpc

def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = meu_qoelho_mq_pb2_grpc.MeuQoelhoMQStub(channel)
        id = input("Id: ")
        password = input("Senha: ")
        cred = meu_qoelho_mq_pb2.Credentials(id = id, password = password)
        res_create_user = Client.create_user(stub, id, password)
        print(res_create_user)
        Client.list_channels(stub)
        canal = input("Escolha o canal: ")
        res_sub = Client.subscribe_to_channel(stub, cred, canal)
        print(res_sub)
        sub = meu_qoelho_mq_pb2.Subscriber(credentials = cred, channel = canal)

        while(1):
            Client.get_messages_from_subscrition(stub, sub)
            time.sleep(10)


if __name__ == "__main__":
    logging.basicConfig()
    run()

