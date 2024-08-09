package meuqoelhomq;

import io.grpc.*;

import java.io.IOException;
import java.nio.channels.Channels;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MeuQoelhoMqClient {
  private static final Logger logger = Logger.getLogger(MeuQoelhoMqClient.class.getName());

  private final MeuQoelhoMQGrpc.MeuQoelhoMQBlockingStub blockingStub;
  private final MeuQoelhoMQGrpc.MeuQoelhoMQStub asyncStub;

  public MeuQoelhoMqClient(Channel channel) {
    blockingStub = MeuQoelhoMQGrpc.newBlockingStub(channel);
    asyncStub = MeuQoelhoMQGrpc.newStub(channel);
  }

  public void listChannels(String channel_name) {

    meuqoelhomq.Channels channel = meuqoelhomq.Channels.newBuilder().setName("Canal1").build();
    meuqoelhomq.Credentials cred = meuqoelhomq.Credentials.newBuilder().setId("Paulo").setPassword("92930506").build();
    Subscriber sub = meuqoelhomq.Subscriber.newBuilder().setChannel(channel_name).setCredentials(cred).build();
    Response res = blockingStub.consultNumberOfMessages(sub);
    System.out.println(res.getResponse());

    // for (int i = 1; channels.hasNext(); i++) {
    //   Channels channel_ = channels.next();
    // }

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
    client.listChannels("Canal1");

  }
}