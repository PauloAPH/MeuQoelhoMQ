from __future__ import print_function
from datetime import datetime, timezone

import logging
import grpc

import meu_coelho_mq_client as Client

from database import create_tables
from database import create_database
from protos import meu_coelho_mq_pb2
from protos import meu_coelho_mq_pb2_grpc

def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    with grpc.insecure_channel("localhost:50051") as channel:
        #create_database.create_database()
        create_tables.create_tables()
        stub = meu_coelho_mq_pb2_grpc.MeuCoelhoMQStub(channel)
        name = "Canal3"
        tipo = "Simples"
        Client.create_channel_request(stub, name, tipo)
        name = "Canal2"
        tipo = "Multiplo"
        Client.create_channel_request(stub, name, tipo)
        

if __name__ == "__main__":
    logging.basicConfig()
    run()

