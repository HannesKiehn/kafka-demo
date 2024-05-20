package com.kiehn.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "example", groupId = "example-group")
    void listener(String message) {
        System.out.println("Received Message in group example-group: " + message);
    }
}
