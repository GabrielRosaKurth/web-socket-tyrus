import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/echo")
public class EchoEndpoint {

    @OnOpen
    public void onOpen (Session session) throws IOException {
        System.out.println("Sessão ECHO aberta: " + session);
        session.getBasicRemote().sendText("Sessão ECHO aberta com sucesso!");
    }


}
