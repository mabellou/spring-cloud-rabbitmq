package com.mabellou.cloudstream.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloBindingInput {

    String GREETING = "consumer";

    @Input(GREETING)
    SubscribableChannel greetingConsumer();
}
