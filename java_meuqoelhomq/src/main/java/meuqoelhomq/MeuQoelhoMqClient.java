package meuqoelhomq;

import io.grpc.*;

import java.io.IOException;
import java.nio.channels.Channels;
import java.util.Scanner;
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

  public void listChannels() {
    meuqoelhomq.Response res = meuqoelhomq.Response.newBuilder().setResponse("channel_name").build();
    Iterator<meuqoelhomq.Channels> channels;
    try {
      channels = blockingStub.listChannels(res);
      for (int i = 1; channels.hasNext(); i++) {
        meuqoelhomq.Channels channel_ = channels.next();
        System.out.println(channel_.getName() + " do tipo " + channel_.getTipo());
      }
    } catch (StatusRuntimeException e) {
      System.out.println("Falha na conexão");
    }

  }

  public void createUser(String id, String password) {
    meuqoelhomq.Credentials cred = meuqoelhomq.Credentials.newBuilder().setId(id).setPassword(password).build();
    meuqoelhomq.Response res = blockingStub.register(cred);
    System.out.println(res);
  }

  public static void main(String[] args) throws InterruptedException {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build();
    MeuQoelhoMqClient client = new MeuQoelhoMqClient(channel);
    client.listChannels();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Id: ");
    String id = scanner.nextLine();
    System.out.print("Senha: ");
    String password = scanner.nextLine();
    client.createUser(id, password);




    channel.shutdown();

    // meuqoelhomq.Channels channel =
    // meuqoelhomq.Channels.newBuilder().setName("Canal1").build();
    // meuqoelhomq.Credentials cred =
    // meuqoelhomq.Credentials.newBuilder().setId("Paulo").setPassword("92930506").build();
    // Subscriber sub =
    // meuqoelhomq.Subscriber.newBuilder().setChannel(channel_name).setCredentials(cred).build();

  }
}