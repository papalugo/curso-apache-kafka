package com.papalugo.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send message {}", message);
        kafkaTemplate.send("str-topic", message);
//                .whenComplete((success, error) -> {
//            if (error == null) {
//                log.info("Send message with successful: Partition {} Offset {}, Message: {}",
//                        success.getRecordMetadata().partition(),
//                        success.getRecordMetadata().offset(),
//                        message
//                );
//            } else {
//                log.error("Error send message");
//            }
//        });
    }
}
