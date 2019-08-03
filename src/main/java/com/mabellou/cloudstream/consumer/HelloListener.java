package com.mabellou.cloudstream.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloBindingInput.class)
public class HelloListener {

    @StreamListener(target = HelloBindingInput.GREETING)
    public void processHelloChannelGreeting(String msg) {
        System.out.println("Received " + msg);
    }
}
