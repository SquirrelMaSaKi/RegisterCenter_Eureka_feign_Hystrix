package com.rj.receive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.nio.channels.Channel;

@Component
public class ReceiveMessageBean {
    @Autowired
    private ReceiveMessage receiveMessage;

    /**
     * 有两种方式：前提条件 我们必须通过注解启动绑定这个交换机
     */
    //@StreamListener("RJexchange")
    public void receiveMessage1(String message) {
        System.err.println("接收到的消息是："+message);
    }
    //@ServiceActivator(inputChannel = "RJexchange")
    public void receiveMessage2(String message) {
        System.err.println("收到消息："+message);
    }

    /**
     * 以上方法，都是通过通道拿到，但是没有用到接口中的订阅通道方法SubscribableChannel receiveChannel()
     */
    @PostConstruct //后置构造方法，bean标签中的initmethod
    public void receiveMessage3() {
        SubscribableChannel channel = receiveMessage.receiveChannel();
        //创建一个订阅，订阅一个指定的交换机，需要new一个messageHandler对象，接收信息并指定如何执行
        channel.subscribe(new MessageHandler() {
            @Override
            public void handleMessage(Message<?> message) throws MessagingException {
                //获取对象，注意是数组，否则直接打印payload结果是[B@14555
                Object payload = message.getPayload();
                System.err.println("收到："+ new String((byte[])payload));
            }
        });
    }
}
