package app.core.service;


import app.core.dto.Email;
import com.google.gson.Gson;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.util.Map;

@Component
public class Receiver {
    @JmsListener(destination = "SBER.IN", containerFactory = "myFactory")
    public void receiveMessage(Email email) {
        System.out.println("Recieves <" + email + ">");
    }

    @JmsListener(destination = "inbound.queu",containerFactory = "containerFactory")
    @SendTo("outbound.queue")
    public String receiveMessageInboundQueu(final Message jsonMessage) throws JMSException {
        String messageData = null;
        System.out.println("Received message " + jsonMessage);
        String response = null;
        if(jsonMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)jsonMessage;
            messageData = textMessage.getText();
            Map map = new Gson().fromJson(messageData, Map.class);
            response  = "Hello " + map.get("name");
        }
        return response;

    }


}
