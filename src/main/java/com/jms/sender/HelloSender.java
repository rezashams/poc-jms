package com.jms.sender;

import com.jms.config.JmsConfig;
import com.jms.model.HelloWorldMessage;
import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class HelloSender {

    private  final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public  void sendMessage() {
        System.out.println("sending message");
        HelloWorldMessage message = HelloWorldMessage.builder()
                .id(UUID.randomUUID())
                .message("Hello World")
                .build();
        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE,message);
        System.out.println("Message sent");
    }
}
