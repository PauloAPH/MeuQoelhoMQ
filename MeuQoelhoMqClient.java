package meu_qoelho_mq;

import MeuCoelhoMQProto.Response;

import com.google.common.annotations.VisibleForTesting;
import com.google.protobuf.Message;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.opencensus.metrics.export.Point;
import MeuCoelhoMQProto.MeuCoelhoMQGrpc;
import MeuCoelhoMQProto.MeuCoelhoMQGrpc.MeuCoelhoMQBlockingStub;
import MeuCoelhoMQProto.MeuCoelhoMQGrpc.MeuCoelhoMQStub;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuQoelhoMqClient {

  private final MeuCoelhoMQBlockingStub blockingStub;
  private final MeuCoelhoMQStub asyncStub;

  /** Construct client for accessing MeuQoelhoMqClient server using the existing channel. */
  public MeuCoelhoMQClient(Channel channel) {

    blockingStub = MeuCoelhoMQGrpc.newBlockingStub(channel);
    asyncStub = MeuCoelhoMQGrpc.newStub(channel);
  }

  public void listFeatures(String channel_name) {
    Channel channel = Channel.newBuilder().setName(channel_name).build();
    Iterator<Response> response;
    try {
      response = blockingStub.ListChannels(channel);
      for (int i = 1; response.hasNext(); i++) {
        Response response = response.next();
      }
    } catch (StatusRuntimeException e) {
    }
  }

  public static void main(String[] args) throws InterruptedException {
    String target = "localhost:8980";
    if (args.length > 0) {
      if ("--help".equals(args[0])) {
        System.err.println("Usage: [target]");
        System.err.println("");
        System.err.println("  target  The server to connect to. Defaults to " + target);
        System.exit(1);
      }
      target = args[0];
    }

    ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
        .build();
    try {
      MeuQoelhoMqClient client = new MeuQoelhoMqClient(channel);

      // Looking for features between 40, -75 and 42, -73.
      client.listFeatures("Canal");

      if (!finishLatch.await(1, TimeUnit.MINUTES)) {
        client.warning("routeChat can not finish within 1 minutes");
      }
    } finally {
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }

}