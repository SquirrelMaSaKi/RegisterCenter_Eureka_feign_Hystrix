package com.rj;

import com.rj.receive.ReceiveMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ReceiveMessage.class)
public class MqReceiveStartApp {
    public static void main(String[] args) {
        SpringApplication.run(MqReceiveStartApp.class, args);
    }
}
