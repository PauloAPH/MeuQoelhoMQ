from __future__ import print_function
from datetime import datetime, timezone

import grpc
import logging
import re
import time

from meu_qoelho_mq_client import Client

from protos import meu_qoelho_mq_pb2
from protos import meu_qoelho_mq_pb2_grpc

def get_first_words(strings):
    return [s.split()[0] for s in strings]

def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = meu_qoelho_mq_pb2_grpc.MeuQoelhoMQStub(channel)
        channels = Client.list_channels(stub)
        channels_names = get_first_words(channels)
        print("Canais disponiveis")
        for channel in channels:
            print(channel)
        continue_ = 0
        while continue_ != 1:
            channel_ = input("Canal para publicação: ")
            if channel_ in channels_names:
                continue_ = 1
            else:
                print("Canal " + channel_ + " não existe, por favor exolha um canal valido!")

        while(1):
            now = datetime.now()
            date_time_str = now.strftime("%Y-%m-%d %H:%M:%S")
            print("Publicando:" + date_time_str)
            Client.publish_message(stub, date_time_str, channel_)
            time.sleep(5)


if __name__ == "__main__":
    logging.basicConfig()
    run()

