package com.rj.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {
    @Autowired
    private SendMessage sendMessage;

    @RequestMapping("/send")
    public String sendMessage(String msg) {
        MessageChannel channel = sendMessage.sendChannel();
        channel.send(new GenericMessage<>(msg)); //发送消息
        return "ok";
    }
}
