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
import math
import time

import grpc
from protos import meu_coelho_mq_pb2
from protos import meu_coelho_mq_pb2_grpc
import resources as RS


class MeuCoelhoMQServicer(meu_coelho_mq_pb2_grpc.MeuCoelhoMQServicer):
    """Provides methods that implement functionality of MeuCoelhoMQS server."""

    def __init__(self):
        print("Start")
        
    def CreateChannel(self, request, context):
        match request.tipo:
            case 0:
                response = "Request recebida criando uma fila simples"
                RS.insert_channel(request.name, request.tipo)
            case 1:
                response = "Request recebida criando uma fila multipla"
                RS.insert_channel(request.name, request.tipo)

        print(response)        
        return meu_coelho_mq_pb2.Response(response = response)
    
    def DeleteChannel(self, request, context):
        RS.delete_channel(request.name)
        response = "Fila " + request.name + "deletada"
        print(response)
        return meu_coelho_mq_pb2.Response(response = response)



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
