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
        print("Canais disponiveis")
        Client.list_channels(stub)
        channel = input("Canal para publicação: ")

        while(1):
            now = datetime.now()
            date_time_str = now.strftime("%Y-%m-%d %H:%M:%S")
            print("Publicando:" + date_time_str)
            Client.publish_message(stub, date_time_str, channel)
            time.sleep(5)


if __name__ == "__main__":
    logging.basicConfig()
    run()

