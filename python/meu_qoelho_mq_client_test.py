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

        mock_response = meu_qoelho_mq_pb2.Response(response = "Request recebida " + name + " do tipo " + tipo, status = 0)
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

        mock_response = meu_qoelho_mq_pb2.Response(response = "Request recebida " + name + " do tipo " + tipo, status = 0)
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

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao criar canal.", status = 1)
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

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao criar canal.", status = 1)
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

        mock_response = meu_qoelho_mq_pb2.Response(response = "Usuario criado com sucesso", status = 0)
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

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao criar canal.", status = 1)
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

        mock_response = meu_qoelho_mq_pb2.Response(response = name + " deletado", status = 0)
        self.mock_stub.DeleteChannel = MagicMock(return_value=mock_response)

        expected_response = "Canal deletado com sucesso"
        result_response = Client.delete_channel_request(self.mock_stub, name)

        self.mock_stub.DeleteChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)

    def test_delete_channel_request_invalid(self):
        # Mock
        name = "test_channel"
        channel = meu_qoelho_mq_pb2.Channels(name = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro ao deletar canal.", status = 1)
        self.mock_stub.DeleteChannel = MagicMock(return_value=mock_response)

        expected_response = "Erro ao deletar canal" 
        result_response = Client.delete_channel_request(self.mock_stub, name)

        self.mock_stub.DeleteChannel.assert_called_once_with(channel)
        self.assertEqual(expected_response, result_response)

    #subscribe_to_channel
    def test_subscribe_to_channel_new_valid_user(self):
        # Mock
        name = "test_channel"
        id = "Usuario"
        password = "123456"
        user = meu_qoelho_mq_pb2.Credentials(id = id, password = password)
        subs = meu_qoelho_mq_pb2.Subscriber(credentials = user, channel = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Inscrito na fila " + name, status = 0)
        self.mock_stub.SubscribeToChannel = MagicMock(return_value=mock_response)

        expected_response = "Inscrito na fila " + name
        result_response = Client.subscribe_to_channel(self.mock_stub, user, name)

        self.mock_stub.SubscribeToChannel.assert_called_once_with(subs)
        self.assertEqual(expected_response, result_response)

    def test_subscribe_to_channel_already_subscribed_valid_user(self):
        # Mock
        name = "test_channel"
        id = "Usuario"
        password = "123456"
        user = meu_qoelho_mq_pb2.Credentials(id = id, password = password)
        subs = meu_qoelho_mq_pb2.Subscriber(credentials = user, channel = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Já cadastrado em " + name, status = 0)
        self.mock_stub.SubscribeToChannel = MagicMock(return_value=mock_response)

        expected_response = "Já cadastrado em " + name
        result_response = Client.subscribe_to_channel(self.mock_stub, user, name)

        self.mock_stub.SubscribeToChannel.assert_called_once_with(subs)
        self.assertEqual(expected_response, result_response)

    def test_subscribe_to_channel_with_old_msg_valid_user(self):
        # Mock
        name = "test_channel"
        id = "Usuario"
        password = "123456"
        user = meu_qoelho_mq_pb2.Credentials(id = id, password = password)
        subs = meu_qoelho_mq_pb2.Subscriber(credentials = user, channel = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Inscrito na fila " + name + " herdando mensagens", status = 0)
        self.mock_stub.SubscribeToChannel = MagicMock(return_value=mock_response)

        expected_response = "Inscrito na fila " + name + " herdando mensagens"
        result_response = Client.subscribe_to_channel(self.mock_stub, user, name)

        self.mock_stub.SubscribeToChannel.assert_called_once_with(subs)
        self.assertEqual(expected_response, result_response)

    def test_subscribe_to_channel_database_error(self):
        # Mock
        name = "test_channel"
        id = "Usuario"
        password = "123456"
        user = meu_qoelho_mq_pb2.Credentials(id = id, password = password)
        subs = meu_qoelho_mq_pb2.Subscriber(credentials = user, channel = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Erro na inscrição", status = 1)
        self.mock_stub.SubscribeToChannel = MagicMock(return_value=mock_response)

        expected_response = "ERROR: Erro na inscrição"
        result_response = Client.subscribe_to_channel(self.mock_stub, user, name)

        self.mock_stub.SubscribeToChannel.assert_called_once_with(subs)
        self.assertEqual(expected_response, result_response)

    def test_subscribe_to_channel_channel_invalid(self):
        # Mock
        name = "test_channel"
        id = "Usuario"
        password = "123456"
        user = meu_qoelho_mq_pb2.Credentials(id = id, password = password)
        subs = meu_qoelho_mq_pb2.Subscriber(credentials = user, channel = name)

        mock_response = meu_qoelho_mq_pb2.Response(response = "Canal não existe", status = 1)
        self.mock_stub.SubscribeToChannel = MagicMock(return_value=mock_response)

        expected_response = "ERROR: Canal não existe"
        result_response = Client.subscribe_to_channel(self.mock_stub, user, name)

        self.mock_stub.SubscribeToChannel.assert_called_once_with(subs)
        self.assertEqual(expected_response, result_response)
    
    #list_channel
    def test_list_channels(self):
        # Mock
        channel1 = meu_qoelho_mq_pb2.Channels(name="Canal1", tipo=meu_qoelho_mq_pb2.Tipo.SIMPLES)
        channel2 = meu_qoelho_mq_pb2.Channels(name="Canal2", tipo=meu_qoelho_mq_pb2.Tipo.MULTIPLO)

        mock_stream = iter([channel1, channel2])
        self.mock_stub.ListChannels = MagicMock(return_value=mock_stream)

        expected_response = [
                    "Canal1 Tipo: SIMPLES",
                    "Canal2 Tipo: MULTIPLO"
                ]
        result_response = Client.list_channels(self.mock_stub)

        self.assertEqual(expected_response, result_response)

    def test_list_channels_empty(self):
        # Mock
        mock_stream = iter([])
        self.mock_stub.ListChannels = MagicMock(return_value=mock_stream)

        expected_response = []
        result_response = Client.list_channels(self.mock_stub)

        self.assertEqual(expected_response, result_response)

if __name__ == '__main__':
    unittest.main()
