import org.glassfish.tyrus.server.Server;

public class Main {

    public static void main (String args[]) {
        Server server = new Server("localhost", 8082, "/lionx", null, TestEndpoint.class, EchoEndpoint.class);

        try {
            server.start();
            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

