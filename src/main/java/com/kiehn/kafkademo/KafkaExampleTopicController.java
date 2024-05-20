package com.kiehn.kafkademo;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example-topic")
@RequiredArgsConstructor
public class KafkaExampleTopicController {

    private final KafkaTemplate<String, String> template;

    @PostMapping("/send-message")
    public void sendMessageToExampleTopic() {
        template.send("example", "Hello, World!");
    }
}
