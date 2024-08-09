
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.ManagedChannelBuilder;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import meuqoelhomq.protos.MeuQoelhoMQGrpc;
import meuqoelhomq.protos.MeuQoelhoMQProtos;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.catalog.CatalogFeatures.Feature;

public class MeuQoelhoMqClient {
  private static final Logger logger = Logger.getLogger(MeuQoelhoMqClient.class.getName());

  private final MeuQoelhoMQGrpc.MeuQoelhoMQBlockingStub blockingStub;
  private final MeuQoelhoMQGrpc.MeuQoelhoMQStub asyncStub;

  public MeuQoelhoMqClient(Channel channel) {
    blockingStub = MeuQoelhoMQGrpc.newBlockingStub(channel);
    asyncStub = MeuQoelhoMQGrpc.newStub(channel);
  }

  public void listChannels(String channel_name) {

    MeuQoelhoMQProtos.Response res = MeuQoelhoMQProtos.Response.newBuilder().setResponse("Teste").build();
    System.out.println(res.getResponse());
    Iterator<MeuQoelhoMQProtos.Channels> channels;
    channels = blockingStub.listChannels(res);
    for (int i = 1; channels.hasNext(); i++) {
      MeuQoelhoMQProtos.Channels channel_ = channels.next();
    }

  }

  public static void main(String[] args) throws InterruptedException {
    System.out.println("OIIIII");

    String target = "localhost:50051";
    if (args.length > 0) {
      if ("--help".equals(args[0])) {
        System.err.println("Usage: [target]");
        System.err.println("");
        System.err.println("  target  The server to connect to. Defaults to " + target);
        System.exit(1);
      }
      target = args[0];
    }

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build();
    MeuQoelhoMqClient client = new MeuQoelhoMqClient(channel);
    System.out.println(client.toString());
    System.out.println("OIIIII");

    client.listChannels("Canal1");

  }
}