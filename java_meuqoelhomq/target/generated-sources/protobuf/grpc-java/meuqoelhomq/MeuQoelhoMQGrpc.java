package meuqoelhomq;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: meu_qoelho_mq.proto")
public final class MeuQoelhoMQGrpc {

  private MeuQoelhoMQGrpc() {}

  public static final String SERVICE_NAME = "meuqoelhomq.MeuQoelhoMQ";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Channels,
      meuqoelhomq.Response> getCreateChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChannel",
      requestType = meuqoelhomq.Channels.class,
      responseType = meuqoelhomq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Channels,
      meuqoelhomq.Response> getCreateChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Channels, meuqoelhomq.Response> getCreateChannelMethod;
    if ((getCreateChannelMethod = MeuQoelhoMQGrpc.getCreateChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getCreateChannelMethod = MeuQoelhoMQGrpc.getCreateChannelMethod) == null) {
          MeuQoelhoMQGrpc.getCreateChannelMethod = getCreateChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Channels, meuqoelhomq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Channels.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("CreateChannel"))
              .build();
        }
      }
    }
    return getCreateChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Channels,
      meuqoelhomq.Response> getDeleteChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteChannel",
      requestType = meuqoelhomq.Channels.class,
      responseType = meuqoelhomq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Channels,
      meuqoelhomq.Response> getDeleteChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Channels, meuqoelhomq.Response> getDeleteChannelMethod;
    if ((getDeleteChannelMethod = MeuQoelhoMQGrpc.getDeleteChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getDeleteChannelMethod = MeuQoelhoMQGrpc.getDeleteChannelMethod) == null) {
          MeuQoelhoMQGrpc.getDeleteChannelMethod = getDeleteChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Channels, meuqoelhomq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Channels.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("DeleteChannel"))
              .build();
        }
      }
    }
    return getDeleteChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Response,
      meuqoelhomq.Channels> getListChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListChannels",
      requestType = meuqoelhomq.Response.class,
      responseType = meuqoelhomq.Channels.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Response,
      meuqoelhomq.Channels> getListChannelsMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Response, meuqoelhomq.Channels> getListChannelsMethod;
    if ((getListChannelsMethod = MeuQoelhoMQGrpc.getListChannelsMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getListChannelsMethod = MeuQoelhoMQGrpc.getListChannelsMethod) == null) {
          MeuQoelhoMQGrpc.getListChannelsMethod = getListChannelsMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Response, meuqoelhomq.Channels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Channels.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("ListChannels"))
              .build();
        }
      }
    }
    return getListChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Message,
      meuqoelhomq.Response> getPublishMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishMessage",
      requestType = meuqoelhomq.Message.class,
      responseType = meuqoelhomq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Message,
      meuqoelhomq.Response> getPublishMessageMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Message, meuqoelhomq.Response> getPublishMessageMethod;
    if ((getPublishMessageMethod = MeuQoelhoMQGrpc.getPublishMessageMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getPublishMessageMethod = MeuQoelhoMQGrpc.getPublishMessageMethod) == null) {
          MeuQoelhoMQGrpc.getPublishMessageMethod = getPublishMessageMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Message, meuqoelhomq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("PublishMessage"))
              .build();
        }
      }
    }
    return getPublishMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Credentials,
      meuqoelhomq.Response> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = meuqoelhomq.Credentials.class,
      responseType = meuqoelhomq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Credentials,
      meuqoelhomq.Response> getRegisterMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Credentials, meuqoelhomq.Response> getRegisterMethod;
    if ((getRegisterMethod = MeuQoelhoMQGrpc.getRegisterMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getRegisterMethod = MeuQoelhoMQGrpc.getRegisterMethod) == null) {
          MeuQoelhoMQGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Credentials, meuqoelhomq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Credentials.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Subscriber,
      meuqoelhomq.Response> getSubscribeToChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToChannel",
      requestType = meuqoelhomq.Subscriber.class,
      responseType = meuqoelhomq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Subscriber,
      meuqoelhomq.Response> getSubscribeToChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Subscriber, meuqoelhomq.Response> getSubscribeToChannelMethod;
    if ((getSubscribeToChannelMethod = MeuQoelhoMQGrpc.getSubscribeToChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getSubscribeToChannelMethod = MeuQoelhoMQGrpc.getSubscribeToChannelMethod) == null) {
          MeuQoelhoMQGrpc.getSubscribeToChannelMethod = getSubscribeToChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Subscriber, meuqoelhomq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Subscriber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("SubscribeToChannel"))
              .build();
        }
      }
    }
    return getSubscribeToChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Subscriber,
      meuqoelhomq.Response> getConsultNumberOfMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsultNumberOfMessages",
      requestType = meuqoelhomq.Subscriber.class,
      responseType = meuqoelhomq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Subscriber,
      meuqoelhomq.Response> getConsultNumberOfMessagesMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Subscriber, meuqoelhomq.Response> getConsultNumberOfMessagesMethod;
    if ((getConsultNumberOfMessagesMethod = MeuQoelhoMQGrpc.getConsultNumberOfMessagesMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getConsultNumberOfMessagesMethod = MeuQoelhoMQGrpc.getConsultNumberOfMessagesMethod) == null) {
          MeuQoelhoMQGrpc.getConsultNumberOfMessagesMethod = getConsultNumberOfMessagesMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Subscriber, meuqoelhomq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsultNumberOfMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Subscriber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MeuQoelhoMQMethodDescriptorSupplier("ConsultNumberOfMessages"))
              .build();
        }
      }
    }
    return getConsultNumberOfMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meuqoelhomq.Subscriber,
      meuqoelhomq.Response> getGetMessageFromChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessageFromChannel",
      requestType = meuqoelhomq.Subscriber.class,
      responseType = meuqoelhomq.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<meuqoelhomq.Subscriber,
      meuqoelhomq.Response> getGetMessageFromChannelMethod() {
    io.grpc.MethodDescriptor<meuqoelhomq.Subscriber, meuqoelhomq.Response> getGetMessageFromChannelMethod;
    if ((getGetMessageFromChannelMethod = MeuQoelhoMQGrpc.getGetMessageFromChannelMethod) == null) {
      synchronized (MeuQoelhoMQGrpc.class) {
        if ((getGetMessageFromChannelMethod = MeuQoelhoMQGrpc.getGetMessageFromChannelMethod) == null) {
          MeuQoelhoMQGrpc.getGetMessageFromChannelMethod = getGetMessageFromChannelMethod =
              io.grpc.MethodDescriptor.<meuqoelhomq.Subscriber, meuqoelhomq.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMessageFromChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Subscriber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meuqoelhomq.Response.getDefaultInstance()))
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
    return new MeuQoelhoMQStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeuQoelhoMQBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MeuQoelhoMQBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeuQoelhoMQFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MeuQoelhoMQFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class MeuQoelhoMQImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    public void createChannel(meuqoelhomq.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    public void deleteChannel(meuqoelhomq.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     *List all channels avaliable
     * </pre>
     */
    public void listChannels(meuqoelhomq.Response request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Channels> responseObserver) {
      asyncUnimplementedUnaryCall(getListChannelsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    public void publishMessage(meuqoelhomq.Message request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    public void register(meuqoelhomq.Credentials request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    public void subscribeToChannel(meuqoelhomq.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeToChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    public void consultNumberOfMessages(meuqoelhomq.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getConsultNumberOfMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     *Stream all messages from a channel
     * </pre>
     */
    public void getMessageFromChannel(meuqoelhomq.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessageFromChannelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                meuqoelhomq.Channels,
                meuqoelhomq.Response>(
                  this, METHODID_CREATE_CHANNEL)))
          .addMethod(
            getDeleteChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                meuqoelhomq.Channels,
                meuqoelhomq.Response>(
                  this, METHODID_DELETE_CHANNEL)))
          .addMethod(
            getListChannelsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                meuqoelhomq.Response,
                meuqoelhomq.Channels>(
                  this, METHODID_LIST_CHANNELS)))
          .addMethod(
            getPublishMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                meuqoelhomq.Message,
                meuqoelhomq.Response>(
                  this, METHODID_PUBLISH_MESSAGE)))
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                meuqoelhomq.Credentials,
                meuqoelhomq.Response>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getSubscribeToChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                meuqoelhomq.Subscriber,
                meuqoelhomq.Response>(
                  this, METHODID_SUBSCRIBE_TO_CHANNEL)))
          .addMethod(
            getConsultNumberOfMessagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                meuqoelhomq.Subscriber,
                meuqoelhomq.Response>(
                  this, METHODID_CONSULT_NUMBER_OF_MESSAGES)))
          .addMethod(
            getGetMessageFromChannelMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                meuqoelhomq.Subscriber,
                meuqoelhomq.Response>(
                  this, METHODID_GET_MESSAGE_FROM_CHANNEL)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MeuQoelhoMQStub extends io.grpc.stub.AbstractStub<MeuQoelhoMQStub> {
    private MeuQoelhoMQStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeuQoelhoMQStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeuQoelhoMQStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeuQoelhoMQStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    public void createChannel(meuqoelhomq.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    public void deleteChannel(meuqoelhomq.Channels request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *List all channels avaliable
     * </pre>
     */
    public void listChannels(meuqoelhomq.Response request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Channels> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListChannelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    public void publishMessage(meuqoelhomq.Message request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    public void register(meuqoelhomq.Credentials request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    public void subscribeToChannel(meuqoelhomq.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeToChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    public void consultNumberOfMessages(meuqoelhomq.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsultNumberOfMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Stream all messages from a channel
     * </pre>
     */
    public void getMessageFromChannel(meuqoelhomq.Subscriber request,
        io.grpc.stub.StreamObserver<meuqoelhomq.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMessageFromChannelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MeuQoelhoMQBlockingStub extends io.grpc.stub.AbstractStub<MeuQoelhoMQBlockingStub> {
    private MeuQoelhoMQBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeuQoelhoMQBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeuQoelhoMQBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeuQoelhoMQBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    public meuqoelhomq.Response createChannel(meuqoelhomq.Channels request) {
      return blockingUnaryCall(
          getChannel(), getCreateChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    public meuqoelhomq.Response deleteChannel(meuqoelhomq.Channels request) {
      return blockingUnaryCall(
          getChannel(), getDeleteChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *List all channels avaliable
     * </pre>
     */
    public java.util.Iterator<meuqoelhomq.Channels> listChannels(
        meuqoelhomq.Response request) {
      return blockingServerStreamingCall(
          getChannel(), getListChannelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    public meuqoelhomq.Response publishMessage(meuqoelhomq.Message request) {
      return blockingUnaryCall(
          getChannel(), getPublishMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    public meuqoelhomq.Response register(meuqoelhomq.Credentials request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    public meuqoelhomq.Response subscribeToChannel(meuqoelhomq.Subscriber request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeToChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    public meuqoelhomq.Response consultNumberOfMessages(meuqoelhomq.Subscriber request) {
      return blockingUnaryCall(
          getChannel(), getConsultNumberOfMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Stream all messages from a channel
     * </pre>
     */
    public java.util.Iterator<meuqoelhomq.Response> getMessageFromChannel(
        meuqoelhomq.Subscriber request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMessageFromChannelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MeuQoelhoMQFutureStub extends io.grpc.stub.AbstractStub<MeuQoelhoMQFutureStub> {
    private MeuQoelhoMQFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeuQoelhoMQFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeuQoelhoMQFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeuQoelhoMQFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.Response> createChannel(
        meuqoelhomq.Channels request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Delete a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.Response> deleteChannel(
        meuqoelhomq.Channels request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Publich a message in a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.Response> publishMessage(
        meuqoelhomq.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Register to the service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.Response> register(
        meuqoelhomq.Credentials request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Subscribe to a channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.Response> subscribeToChannel(
        meuqoelhomq.Subscriber request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeToChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Consult the number of messages in a channel that the client is subscribed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<meuqoelhomq.Response> consultNumberOfMessages(
        meuqoelhomq.Subscriber request) {
      return futureUnaryCall(
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
    private final MeuQoelhoMQImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MeuQoelhoMQImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CHANNEL:
          serviceImpl.createChannel((meuqoelhomq.Channels) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Response>) responseObserver);
          break;
        case METHODID_DELETE_CHANNEL:
          serviceImpl.deleteChannel((meuqoelhomq.Channels) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Response>) responseObserver);
          break;
        case METHODID_LIST_CHANNELS:
          serviceImpl.listChannels((meuqoelhomq.Response) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Channels>) responseObserver);
          break;
        case METHODID_PUBLISH_MESSAGE:
          serviceImpl.publishMessage((meuqoelhomq.Message) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Response>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((meuqoelhomq.Credentials) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Response>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_CHANNEL:
          serviceImpl.subscribeToChannel((meuqoelhomq.Subscriber) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Response>) responseObserver);
          break;
        case METHODID_CONSULT_NUMBER_OF_MESSAGES:
          serviceImpl.consultNumberOfMessages((meuqoelhomq.Subscriber) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Response>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_FROM_CHANNEL:
          serviceImpl.getMessageFromChannel((meuqoelhomq.Subscriber) request,
              (io.grpc.stub.StreamObserver<meuqoelhomq.Response>) responseObserver);
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

  private static abstract class MeuQoelhoMQBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeuQoelhoMQBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return meuqoelhomq.MeuQoelhoMq.getDescriptor();
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
    private final String methodName;

    MeuQoelhoMQMethodDescriptorSupplier(String methodName) {
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
