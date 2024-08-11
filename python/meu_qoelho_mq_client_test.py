import unittest

from meu_qoelho_mq_client import Client
from protos import meu_qoelho_mq_pb2
from protos import meu_qoelho_mq_pb2_grpc
from unittest.mock import MagicMock

class TestMeuQoelhoMQClient(unittest.TestCase):
    def setUp(self):
        # Create a mock stub
        self.mock_stub = MagicMock(spec=meu_qoelho_mq_pb2_grpc.MeuQoelhoMQStub)


    #create_channel_request
    def test_create_channel_request_valid_simples(self):
        # Mock
        name = "test_channel"
        tipo = "Simples"
        channel = meu_qoelho_mq_pb2.Channels(name = 'test_channel', tipo = meu_qoelho_mq_pb2.Tipo.SIMPLES)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Request recebida " + name + " do tipo " + tipo, status=0)
        self.mock_stub.CreateChannel = MagicMock(return_value=mock_response)

        expected_response = "Canal criado com sucesso"
        result_response = Client.create_channel_request(self.mock_stub, name, tipo)

        self.mock_stub.CreateChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)

    def test_create_channel_request_valid_multiplo(self):
        # Mock
        name = "test_channel"
        tipo = "Multiplo"
        channel = meu_qoelho_mq_pb2.Channels(name = 'test_channel', tipo = meu_qoelho_mq_pb2.Tipo.MULTIPLO)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Request recebida " + name + " do tipo " + tipo, status=0)
        self.mock_stub.CreateChannel = MagicMock(return_value=mock_response)
        expected_response = "Canal criado com sucesso"
        result_response = Client.create_channel_request(self.mock_stub, name, tipo)

        self.mock_stub.CreateChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)

    def test_create_channel_request_invalid_simples(self):
        # Mock
        name = "test_channel"
        tipo = "Simples"
        channel = meu_qoelho_mq_pb2.Channels(name = 'test_channel', tipo = meu_qoelho_mq_pb2.Tipo.SIMPLES)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao criar canal.", status=1)
        self.mock_stub.CreateChannel = MagicMock(return_value=mock_response)

        expected_response = "Erro ao criar usuario"
        result_response = Client.create_channel_request(self.mock_stub, name, tipo)

        self.mock_stub.CreateChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)

    def test_create_channel_request_invalid_multiplo(self):
        # Mock
        name = "test_channel"
        tipo = "Multiplo"
        channel = meu_qoelho_mq_pb2.Channels(name = 'test_channel', tipo = meu_qoelho_mq_pb2.Tipo.MULTIPLO)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao criar canal.", status=1)
        self.mock_stub.CreateChannel = MagicMock(return_value=mock_response)

        expected_response = "Erro ao criar usuario"
        result_response = Client.create_channel_request(self.mock_stub, name, tipo)

        self.mock_stub.CreateChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)



    #create_user
    def test_create_user_valid(self):
        # Mock
        id = "Usuario"
        password = "123456"
        user = meu_qoelho_mq_pb2.Credentials(id = id, password = password)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Usuario criado com sucesso", status=0)
        self.mock_stub.Register = MagicMock(return_value=mock_response)

        expected_response = "Usuario criado com sucesso"
        result_response = Client.create_user(self.mock_stub, id, password)

        self.mock_stub.Register.assert_called_once_with(user)
        self.assertEqual(expected_response, result_response)

    def test_create_user_invalid(self):
        # Mock
        id = "Usuario"
        password = "123456"
        user = meu_qoelho_mq_pb2.Credentials(id = id, password = password)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao criar canal.", status=1)
        self.mock_stub.Register = MagicMock(return_value=mock_response)

        expected_response = "Erro ao criar usuario"
        result_response = Client.create_user(self.mock_stub, id, password)

        self.mock_stub.Register.assert_called_once_with(user)
        self.assertEqual(expected_response, result_response)

    #delete_channel_request
    def test_delete_channel_request_valid(self):
        # Mock
        name = "test_channel"
        channel = meu_qoelho_mq_pb2.Channels(name = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = name + " deletado", status=0)
        self.mock_stub.DeleteChannel = MagicMock(return_value=mock_response)

        expected_response = "Canal deletado com sucesso"
        result_response = Client.delete_channel_request(self.mock_stub, name)

        self.mock_stub.DeleteChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)

    def test_delete_channel_request_invalid(self):
        # Mock
        name = "test_channel"
        channel = meu_qoelho_mq_pb2.Channels(name = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao deletar canal.", status=1)
        self.mock_stub.DeleteChannel = MagicMock(return_value=mock_response)

        expected_response = "Erro ao deletar canal" 
        result_response = Client.delete_channel_request(self.mock_stub, name)

        self.mock_stub.DeleteChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)

if __name__ == '__main__':
    unittest.main()
