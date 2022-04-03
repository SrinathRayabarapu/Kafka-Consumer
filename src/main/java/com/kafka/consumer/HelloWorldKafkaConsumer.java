package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloWorldKafkaConsumer {

    @KafkaListener(topics = "t_test_topic")
    public void consume(String message) {
        log.info("Received : {}", message);
    }

}