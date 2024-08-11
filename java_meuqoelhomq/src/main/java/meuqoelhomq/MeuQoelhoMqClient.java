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

  /**
   * Contructor
   */
  public MeuQoelhoMqClient(Channel channel) {
    blockingStub = MeuQoelhoMQGrpc.newBlockingStub(channel);
    asyncStub = MeuQoelhoMQGrpc.newStub(channel);
  }

    /**
   * Create a channel
   *
   * @param name channel name
   * @param tipo channel type
   */
  public void createChannel(String name, String tipo) {
    meuqoelhomq.Channels channel;
    if (tipo.equals("simples")) {
      channel = meuqoelhomq.Channels.newBuilder().setName(name).setTipo(Tipo.SIMPLES).build();
    } else {
      channel = meuqoelhomq.Channels.newBuilder().setName(name).setTipo(Tipo.MULTIPLO).build();
    }
    meuqoelhomq.Response res = blockingStub.createChannel(channel);
    System.out.println(res.getResponse());
  }

  /**
   * Create a user in server
   *
   * @param id       user id
   * @param password user password
   */
  public void createUser(String id, String password) {
    meuqoelhomq.Credentials cred = meuqoelhomq.Credentials.newBuilder().setId(id).setPassword(password).build();
    meuqoelhomq.Response res = blockingStub.register(cred);
    System.out.println(res.getResponse());
  }

  /**
   * Get messages from a channel already subscribed
   *
   * @param id       user id
   * @param password user password
   * @param channel  channel to subscribe
   */
  public void getMessagesFromSubscrition(String id, String password, String channel) {
    meuqoelhomq.Credentials cred = meuqoelhomq.Credentials.newBuilder().setId(id).setPassword(password).build();
    meuqoelhomq.Subscriber sub = meuqoelhomq.Subscriber.newBuilder().setChannel(channel).setCredentials(cred).build();
    Iterator<meuqoelhomq.Response> responses;
    try {
      responses = blockingStub.getMessageFromChannel(sub);
      for (int i = 1; responses.hasNext(); i++) {
        meuqoelhomq.Response response_ = responses.next();
        System.out.println(response_.getResponse());
      }
    } catch (StatusRuntimeException e) {
      System.out.println("Falha na conexão");
    }
  }

  /**
   * list channels from server.
   */
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

  /**
   * Subscribe a user to a channel.
   *
   * @param id       user id
   * @param password user password
   * @param channel  channel to subscribe
   */
  public void subscribeToChannel(String id, String password, String channel) {
    meuqoelhomq.Credentials cred = meuqoelhomq.Credentials.newBuilder().setId(id).setPassword(password).build();
    meuqoelhomq.Subscriber sub = meuqoelhomq.Subscriber.newBuilder().setChannel(channel).setCredentials(cred).build();
    meuqoelhomq.Response res = blockingStub.subscribeToChannel(sub);
    System.out.println(res.getResponse());
  }

  public static void main(String[] args) throws InterruptedException {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build();
    MeuQoelhoMqClient client = new MeuQoelhoMqClient(channel);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Id: ");
    String id = scanner.nextLine();
    System.out.print("Senha: ");
    String password = scanner.nextLine();
    client.createUser(id, password);
    System.out.println("Canais disponiveis");
    client.listChannels();
    System.out.println("Selecione o canal: ");
    String channelToSubscribe = scanner.nextLine();
    client.subscribeToChannel(id, password, channelToSubscribe);
    while(true) {
      client.getMessagesFromSubscrition(id, password, channelToSubscribe);
      Thread.sleep(10000);
    }
  }
}