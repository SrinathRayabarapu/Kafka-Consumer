package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldKafkaConsumer {

    @KafkaListener(topics = "t_test_topic")
    public void consume(String message) {
        System.out.println("Message from Kafka : " + message);
    }

}