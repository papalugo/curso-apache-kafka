package com.papalugo.strconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StringConsumerListener {

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "stringContainerFactory")
    public void create(String messsage) {
       log.info("CREATE :: Received message {}", messsage);
    }

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "stringContainerFactory")
    public void log(String messsage) {
        log.info("LOG :: Received message {}", messsage);
    }
}
