# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc
import warnings

from protos import meu_coelho_mq_pb2 as protos_dot_meu__coelho__mq__pb2

GRPC_GENERATED_VERSION = '1.65.1'
GRPC_VERSION = grpc.__version__
EXPECTED_ERROR_RELEASE = '1.66.0'
SCHEDULED_RELEASE_DATE = 'August 6, 2024'
_version_not_supported = False

try:
    from grpc._utilities import first_version_is_lower
    _version_not_supported = first_version_is_lower(GRPC_VERSION, GRPC_GENERATED_VERSION)
except ImportError:
    _version_not_supported = True

if _version_not_supported:
    warnings.warn(
        f'The grpc package installed is at version {GRPC_VERSION},'
        + f' but the generated code in protos/meu_coelho_mq_pb2_grpc.py depends on'
        + f' grpcio>={GRPC_GENERATED_VERSION}.'
        + f' Please upgrade your grpc module to grpcio>={GRPC_GENERATED_VERSION}'
        + f' or downgrade your generated code using grpcio-tools<={GRPC_VERSION}.'
        + f' This warning will become an error in {EXPECTED_ERROR_RELEASE},'
        + f' scheduled for release on {SCHEDULED_RELEASE_DATE}.',
        RuntimeWarning
    )


class MeuCoelhoMQStub(object):
    """Interface exported by the server.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateChannel = channel.unary_unary(
                '/routeguide.MeuCoelhoMQ/CreateChannel',
                request_serializer=protos_dot_meu__coelho__mq__pb2.Channel.SerializeToString,
                response_deserializer=protos_dot_meu__coelho__mq__pb2.Response.FromString,
                _registered_method=True)
        self.DeleteChannel = channel.unary_unary(
                '/routeguide.MeuCoelhoMQ/DeleteChannel',
                request_serializer=protos_dot_meu__coelho__mq__pb2.Channel.SerializeToString,
                response_deserializer=protos_dot_meu__coelho__mq__pb2.Response.FromString,
                _registered_method=True)
        self.ListChannels = channel.unary_stream(
                '/routeguide.MeuCoelhoMQ/ListChannels',
                request_serializer=protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
                response_deserializer=protos_dot_meu__coelho__mq__pb2.Channel.FromString,
                _registered_method=True)
        self.PublishMessage = channel.unary_unary(
                '/routeguide.MeuCoelhoMQ/PublishMessage',
                request_serializer=protos_dot_meu__coelho__mq__pb2.Message.SerializeToString,
                response_deserializer=protos_dot_meu__coelho__mq__pb2.Response.FromString,
                _registered_method=True)
        self.Register = channel.unary_unary(
                '/routeguide.MeuCoelhoMQ/Register',
                request_serializer=protos_dot_meu__coelho__mq__pb2.Credentials.SerializeToString,
                response_deserializer=protos_dot_meu__coelho__mq__pb2.Response.FromString,
                _registered_method=True)
        self.SubscribeToChannel = channel.unary_unary(
                '/routeguide.MeuCoelhoMQ/SubscribeToChannel',
                request_serializer=protos_dot_meu__coelho__mq__pb2.Subscriber.SerializeToString,
                response_deserializer=protos_dot_meu__coelho__mq__pb2.Response.FromString,
                _registered_method=True)
        self.ConsultNumberOfMessages = channel.unary_unary(
                '/routeguide.MeuCoelhoMQ/ConsultNumberOfMessages',
                request_serializer=protos_dot_meu__coelho__mq__pb2.Subscriber.SerializeToString,
                response_deserializer=protos_dot_meu__coelho__mq__pb2.Response.FromString,
                _registered_method=True)


class MeuCoelhoMQServicer(object):
    """Interface exported by the server.
    """

    def CreateChannel(self, request, context):
        """Create a channel
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteChannel(self, request, context):
        """Delete a channel
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListChannels(self, request, context):
        """List all channels avaliable
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PublishMessage(self, request, context):
        """Publich a message in a channel
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Register(self, request, context):
        """Register to the service
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SubscribeToChannel(self, request, context):
        """Subscribe to a channel
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ConsultNumberOfMessages(self, request, context):
        """Consult the number of messages in a channel that the client is subscribed
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MeuCoelhoMQServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateChannel': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateChannel,
                    request_deserializer=protos_dot_meu__coelho__mq__pb2.Channel.FromString,
                    response_serializer=protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
            ),
            'DeleteChannel': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteChannel,
                    request_deserializer=protos_dot_meu__coelho__mq__pb2.Channel.FromString,
                    response_serializer=protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
            ),
            'ListChannels': grpc.unary_stream_rpc_method_handler(
                    servicer.ListChannels,
                    request_deserializer=protos_dot_meu__coelho__mq__pb2.Response.FromString,
                    response_serializer=protos_dot_meu__coelho__mq__pb2.Channel.SerializeToString,
            ),
            'PublishMessage': grpc.unary_unary_rpc_method_handler(
                    servicer.PublishMessage,
                    request_deserializer=protos_dot_meu__coelho__mq__pb2.Message.FromString,
                    response_serializer=protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
            ),
            'Register': grpc.unary_unary_rpc_method_handler(
                    servicer.Register,
                    request_deserializer=protos_dot_meu__coelho__mq__pb2.Credentials.FromString,
                    response_serializer=protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
            ),
            'SubscribeToChannel': grpc.unary_unary_rpc_method_handler(
                    servicer.SubscribeToChannel,
                    request_deserializer=protos_dot_meu__coelho__mq__pb2.Subscriber.FromString,
                    response_serializer=protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
            ),
            'ConsultNumberOfMessages': grpc.unary_unary_rpc_method_handler(
                    servicer.ConsultNumberOfMessages,
                    request_deserializer=protos_dot_meu__coelho__mq__pb2.Subscriber.FromString,
                    response_serializer=protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'routeguide.MeuCoelhoMQ', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('routeguide.MeuCoelhoMQ', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class MeuCoelhoMQ(object):
    """Interface exported by the server.
    """

    @staticmethod
    def CreateChannel(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/routeguide.MeuCoelhoMQ/CreateChannel',
            protos_dot_meu__coelho__mq__pb2.Channel.SerializeToString,
            protos_dot_meu__coelho__mq__pb2.Response.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def DeleteChannel(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/routeguide.MeuCoelhoMQ/DeleteChannel',
            protos_dot_meu__coelho__mq__pb2.Channel.SerializeToString,
            protos_dot_meu__coelho__mq__pb2.Response.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def ListChannels(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(
            request,
            target,
            '/routeguide.MeuCoelhoMQ/ListChannels',
            protos_dot_meu__coelho__mq__pb2.Response.SerializeToString,
            protos_dot_meu__coelho__mq__pb2.Channel.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def PublishMessage(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/routeguide.MeuCoelhoMQ/PublishMessage',
            protos_dot_meu__coelho__mq__pb2.Message.SerializeToString,
            protos_dot_meu__coelho__mq__pb2.Response.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def Register(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/routeguide.MeuCoelhoMQ/Register',
            protos_dot_meu__coelho__mq__pb2.Credentials.SerializeToString,
            protos_dot_meu__coelho__mq__pb2.Response.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def SubscribeToChannel(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/routeguide.MeuCoelhoMQ/SubscribeToChannel',
            protos_dot_meu__coelho__mq__pb2.Subscriber.SerializeToString,
            protos_dot_meu__coelho__mq__pb2.Response.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def ConsultNumberOfMessages(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/routeguide.MeuCoelhoMQ/ConsultNumberOfMessages',
            protos_dot_meu__coelho__mq__pb2.Subscriber.SerializeToString,
            protos_dot_meu__coelho__mq__pb2.Response.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
