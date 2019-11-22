package com.rj;

import com.rj.mq.SendMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(SendMessage.class)
public class MqSenderStartApp {
    public static void main(String[] args) {
        SpringApplication.run(MqSenderStartApp.class, args);
    }
}
