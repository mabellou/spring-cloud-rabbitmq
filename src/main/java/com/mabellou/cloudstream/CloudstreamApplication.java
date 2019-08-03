package com.mabellou.cloudstream;

import com.mabellou.cloudstream.producer.HelloBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(HelloBinding.class)
@SpringBootApplication
public class CloudstreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudstreamApplication.class, args);
	}

}
