package com.rj.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SendMessage {
    @Output("RJexchange")   //声明当前接口是一个生产者,消息发送到RJexchange交换机
    MessageChannel sendChannel(); //发送的消息通道
}
