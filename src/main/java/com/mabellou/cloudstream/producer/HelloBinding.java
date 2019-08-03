package com.mabellou.cloudstream.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloBinding {

    @Output("producer")
    MessageChannel greetingProducer();
}
