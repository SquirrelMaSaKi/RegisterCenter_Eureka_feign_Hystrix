package com.rj.receive;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReceiveMessage {
    @Input("RJexchange")
    SubscribableChannel receiveChannel(); //接收消息的通道
}
