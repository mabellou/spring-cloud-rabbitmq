package com.mabellou.cloudstream.producer;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private MessageChannel greet;

    public ProducerController(HelloBinding binding) {
        greet = binding.greetingProducer();
    }

    @GetMapping("/greet/{name}")
    public void publish(@PathVariable String name) {
        String greeting = "Hello, " + name + "!";
        Message<String> msg = MessageBuilder.withPayload(greeting)
                .build();
        this.greet.send(msg);
    }
}
