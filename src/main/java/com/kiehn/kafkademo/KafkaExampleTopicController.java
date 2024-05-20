package com.kiehn.kafkademo;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example-topic")
@RequiredArgsConstructor
public class KafkaExampleTopicController {

    private final KafkaTemplate<String, String> template;

    @PostMapping("/send-message")
    public void sendMessageToExampleTopic(@RequestBody MessageRequest request) {
        template.send("example", request.message());
    }
}
