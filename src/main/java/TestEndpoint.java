import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/test")
public class TestEndpoint {

    @OnOpen
    public void onOpen (Session session) throws IOException {
        System.out.println("Sessão aberta: " + session);
        session.getBasicRemote().sendText("Sessão aberta com sucesso!");
    }

    @OnMessage
    public void onMessage (Session session, String message) throws IOException {
        System.out.println(message);
        session.getBasicRemote().sendText("Mensagem recebida com sucesso!" + message);
    }

    @OnClose
    public void onClose (Session session, CloseReason closeReason) {
        System.out.println("Sessão finalizada!");
    }

}
