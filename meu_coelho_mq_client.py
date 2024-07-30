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

import logging
import random

import grpc
from protos import meu_coelho_mq_pb2
from protos import meu_coelho_mq_pb2_grpc
import resources


def create_channel_request(stub):
    channel = meu_coelho_mq_pb2.Channel(name="Canal1", tipo=1)
    print(stub.CreateChannel(channel))




def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = meu_coelho_mq_pb2_grpc.MeuCoelhoMQStub(channel)
        create_channel_request(stub)


if __name__ == "__main__":
    logging.basicConfig()
    run()
