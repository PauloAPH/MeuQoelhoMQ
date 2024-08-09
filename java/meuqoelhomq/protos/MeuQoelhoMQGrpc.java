package meuqoelhomq.protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: protos/meu_coelho_mq.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MeuQoelhoMQGrpc {

  private MeuQoelhoMQGrpc() {}

  public static final java.lang.String SERVICE_NAME = "meuqoelhomq.MeuQoelhoMQ";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getCreateChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChannel",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Channels.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getCreateChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels, meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getCreateChannelMethod;
    if ((getCreateChannelMethod = MeuQoelhoMQGrpc.getCreateChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getCreateChannelMethod = MeuQoelhoMQGrpc.getCreateChannelMethod) == null) {
          MeuQoelhoMQGrpc.getCreateChannelMethod = getCreateChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels, meuqoelhomq.protos.MeuQoelhoMQProtos.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Channels.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("CreateChannel"))
              .build();
        }
      }
    }
    return getCreateChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getDeleteChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteChannel",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Channels.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getDeleteChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels, meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getDeleteChannelMethod;
    if ((getDeleteChannelMethod = MeuQoelhoMQGrpc.getDeleteChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getDeleteChannelMethod = MeuQoelhoMQGrpc.getDeleteChannelMethod) == null) {
          MeuQoelhoMQGrpc.getDeleteChannelMethod = getDeleteChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels, meuqoelhomq.protos.MeuQoelhoMQProtos.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Channels.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("DeleteChannel"))
              .build();
        }
      }
    }
    return getDeleteChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Response,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Channels> getListChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListChannels",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Channels.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Response,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Channels> getListChannelsMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Response, meuqoelhomq.protos.MeuQoelhoMQProtos.Channels> getListChannelsMethod;
    if ((getListChannelsMethod = MeuQoelhoMQGrpc.getListChannelsMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getListChannelsMethod = MeuQoelhoMQGrpc.getListChannelsMethod) == null) {
          MeuQoelhoMQGrpc.getListChannelsMethod = getListChannelsMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Response, meuqoelhomq.protos.MeuQoelhoMQProtos.Channels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Channels.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("ListChannels"))
              .build();
        }
      }
    }
    return getListChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Message,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getPublishMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishMessage",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Message.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Message,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getPublishMessageMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Message, meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getPublishMessageMethod;
    if ((getPublishMessageMethod = MeuQoelhoMQGrpc.getPublishMessageMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getPublishMessageMethod = MeuQoelhoMQGrpc.getPublishMessageMethod) == null) {
          MeuQoelhoMQGrpc.getPublishMessageMethod = getPublishMessageMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Message, meuqoelhomq.protos.MeuQoelhoMQProtos.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("PublishMessage"))
              .build();
        }
      }
    }
    return getPublishMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getRegisterMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials, meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getRegisterMethod;
    if ((getRegisterMethod = MeuQoelhoMQGrpc.getRegisterMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getRegisterMethod = MeuQoelhoMQGrpc.getRegisterMethod) == null) {
          MeuQoelhoMQGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials, meuqoelhomq.protos.MeuQoelhoMQProtos.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getSubscribeToChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToChannel",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getSubscribeToChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber, meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getSubscribeToChannelMethod;
    if ((getSubscribeToChannelMethod = MeuQoelhoMQGrpc.getSubscribeToChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getSubscribeToChannelMethod = MeuQoelhoMQGrpc.getSubscribeToChannelMethod) == null) {
          MeuQoelhoMQGrpc.getSubscribeToChannelMethod = getSubscribeToChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber, meuqoelhomq.protos.MeuQoelhoMQProtos.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("SubscribeToChannel"))
              .build();
        }
      }
    }
    return getSubscribeToChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getConsultNumberOfMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsultNumberOfMessages",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getConsultNumberOfMessagesMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber, meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getConsultNumberOfMessagesMethod;
    if ((getConsultNumberOfMessagesMethod = MeuQoelhoMQGrpc.getConsultNumberOfMessagesMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getConsultNumberOfMessagesMethod = MeuQoelhoMQGrpc.getConsultNumberOfMessagesMethod) == null) {
          MeuQoelhoMQGrpc.getConsultNumberOfMessagesMethod = getConsultNumberOfMessagesMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber, meuqoelhomq.protos.MeuQoelhoMQProtos.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsultNumberOfMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("ConsultNumberOfMessages"))
              .build();
        }
      }
    }
    return getConsultNumberOfMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getGetMessageFromChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessageFromChannel",
      requestType = meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber.class,
      responseType = meuqoelhomq.protos.MeuQoelhoMQProtos.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
      meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getGetMessageFromChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber, meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getGetMessageFromChannelMethod;
    if ((getGetMessageFromChannelMethod = MeuQoelhoMQGrpc.getGetMessageFromChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getGetMessageFromChannelMethod = MeuQoelhoMQGrpc.getGetMessageFromChannelMethod) == null) {
          MeuQoelhoMQGrpc.getGetMessageFromChannelMethod = getGetMessageFromChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber, meuqoelhomq.protos.MeuQoelhoMQProtos.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMessageFromChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.protos.MeuQoelhoMQProtos.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("GetMessageFromChannel"))
              .build();
        }
      }
    }
    return getGetMessageFromChannelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeuQoelhoMQStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeuQoelhoMQStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeuQoelhoMQStub>() {
        @java.lang.Override
        public MeuQoelhoMQStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeuQoelhoMQStub(channel, callOptions);
        }
      };
    return MeuQoelhoMQStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeuQoelhoMQBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeuQoelhoMQBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeuQoelhoMQBlockingStub>() {
        @java.lang.Override
        public MeuQoelhoMQBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeuQoelhoMQBlockingStub(channel, callOptions);
        }
      };
    return MeuQoelhoMQBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeuQoelhoMQFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeuQoelhoMQFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeuQoelhoMQFutureStub>() {
        @java.lang.Override
        public MeuQoelhoMQFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeuQoelhoMQFutureStub(channel, callOptions);
        }
      };
    return MeuQoelhoMQFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    default void createChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    default void deleteChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     *List all channels avaliable
     * </pre>
     */
    default void listChannels(meuqoelhomq.protos.MeuQoelhoMQProtos.Response request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListChannelsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    default void publishMessage(meuqoelhomq.protos.MeuQoelhoMQProtos.Message request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    default void register(meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    default void subscribeToChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeToChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    default void consultNumberOfMessages(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultNumberOfMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Stream all messages from a channel
     * </pre>
     */
    default void getMessageFromChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessageFromChannelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MeuQoelhoMQ.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class MeuQoelhoMQImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MeuQoelhoMQGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MeuQoelhoMQ.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MeuQoelhoMQStub
      extends io.grpc.stub.AbstractAsyncStub<MeuQoelhoMQStub> {
    private MeuQoelhoMQStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeuQoelhoMQStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeuQoelhoMQStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    public void createChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    public void deleteChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *List all channels avaliable
     * </pre>
     */
    public void listChannels(meuqoelhomq.protos.MeuQoelhoMQProtos.Response request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListChannelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    public void publishMessage(meuqoelhomq.protos.MeuQoelhoMQProtos.Message request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    public void register(meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    public void subscribeToChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeToChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    public void consultNumberOfMessages(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultNumberOfMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Stream all messages from a channel
     * </pre>
     */
    public void getMessageFromChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMessageFromChannelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MeuQoelhoMQ.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MeuQoelhoMQBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MeuQoelhoMQBlockingStub> {
    private MeuQoelhoMQBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeuQoelhoMQBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeuQoelhoMQBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    public meuqoelhomq.protos.MeuQoelhoMQProtos.Response createChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    public meuqoelhomq.protos.MeuQoelhoMQProtos.Response deleteChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *List all channels avaliable
     * </pre>
     */
    public java.util.Iterator<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels> listChannels(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Response request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListChannelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    public meuqoelhomq.protos.MeuQoelhoMQProtos.Response publishMessage(meuqoelhomq.protos.MeuQoelhoMQProtos.Message request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    public meuqoelhomq.protos.MeuQoelhoMQProtos.Response register(meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    public meuqoelhomq.protos.MeuQoelhoMQProtos.Response subscribeToChannel(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeToChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    public meuqoelhomq.protos.MeuQoelhoMQProtos.Response consultNumberOfMessages(meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultNumberOfMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Stream all messages from a channel
     * </pre>
     */
    public java.util.Iterator<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> getMessageFromChannel(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMessageFromChannelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MeuQoelhoMQ.
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MeuQoelhoMQFutureStub
      extends io.grpc.stub.AbstractFutureStub<MeuQoelhoMQFutureStub> {
    private MeuQoelhoMQFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeuQoelhoMQFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeuQoelhoMQFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> createChannel(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> deleteChannel(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Channels request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> publishMessage(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Message request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> register(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> subscribeToChannel(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeToChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.protos.MeuQoelhoMQProtos.Response> consultNumberOfMessages(
        meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultNumberOfMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CHANNEL = 0;
  private static final int METHODID_DELETE_CHANNEL = 1;
  private static final int METHODID_LIST_CHANNELS = 2;
  private static final int METHODID_PUBLISH_MESSAGE = 3;
  private static final int METHODID_REGISTER = 4;
  private static final int METHODID_SUBSCRIBE_TO_CHANNEL = 5;
  private static final int METHODID_CONSULT_NUMBER_OF_MESSAGES = 6;
  private static final int METHODID_GET_MESSAGE_FROM_CHANNEL = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CHANNEL:
          serviceImpl.createChannel((meuqoelhomq.protos.MeuQoelhoMQProtos.Channels) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response>) responseObserver);
          break;
        case METHODID_DELETE_CHANNEL:
          serviceImpl.deleteChannel((meuqoelhomq.protos.MeuQoelhoMQProtos.Channels) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response>) responseObserver);
          break;
        case METHODID_LIST_CHANNELS:
          serviceImpl.listChannels((meuqoelhomq.protos.MeuQoelhoMQProtos.Response) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Channels>) responseObserver);
          break;
        case METHODID_PUBLISH_MESSAGE:
          serviceImpl.publishMessage((meuqoelhomq.protos.MeuQoelhoMQProtos.Message) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_CHANNEL:
          serviceImpl.subscribeToChannel((meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response>) responseObserver);
          break;
        case METHODID_CONSULT_NUMBER_OF_MESSAGES:
          serviceImpl.consultNumberOfMessages((meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_FROM_CHANNEL:
          serviceImpl.getMessageFromChannel((meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.protos.MeuQoelhoMQProtos.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Channels,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response>(
                service, METHODID_CREATE_CHANNEL)))
        .addMethod(
          getDeleteChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Channels,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response>(
                service, METHODID_DELETE_CHANNEL)))
        .addMethod(
          getListChannelsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Channels>(
                service, METHODID_LIST_CHANNELS)))
        .addMethod(
          getPublishMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Message,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response>(
                service, METHODID_PUBLISH_MESSAGE)))
        .addMethod(
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Credentials,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response>(
                service, METHODID_REGISTER)))
        .addMethod(
          getSubscribeToChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response>(
                service, METHODID_SUBSCRIBE_TO_CHANNEL)))
        .addMethod(
          getConsultNumberOfMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response>(
                service, METHODID_CONSULT_NUMBER_OF_MESSAGES)))
        .addMethod(
          getGetMessageFromChannelMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              meuqoelhomq.protos.MeuQoelhoMQProtos.Subscriber,
              meuqoelhomq.protos.MeuQoelhoMQProtos.Response>(
                service, METHODID_GET_MESSAGE_FROM_CHANNEL)))
        .build();
  }

  private static abstract class MeuQoelhoMQBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeuQoelhoMQBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return meuqoelhomq.protos.MeuQoelhoMQProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeuQoelhoMQ");
    }
  }

  private static final class MeuQoelhoMQFileDescriptorSupplier
      extends MeuQoelhoMQBaseDescriptorSupplier {
    MeuQoelhoMQFileDescriptorSupplier() {}
  }

  private static final class MeuQoelhoMQMethodDescriptorSupplier
      extends MeuQoelhoMQBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MeuQoelhoMQMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeuQoelhoMQFileDescriptorSupplier())
              .addMethod(getCreateChannelMethod())
              .addMethod(getDeleteChannelMethod())
              .addMethod(getListChannelsMethod())
              .addMethod(getPublishMessageMethod())
              .addMethod(getRegisterMethod())
              .addMethod(getSubscribeToChannelMethod())
              .addMethod(getConsultNumberOfMessagesMethod())
              .addMethod(getGetMessageFromChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
