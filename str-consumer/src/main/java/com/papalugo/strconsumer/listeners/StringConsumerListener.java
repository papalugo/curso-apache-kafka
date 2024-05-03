package com.papalugo.strconsumer.listeners;

import com.papalugo.strconsumer.custom.StringConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StringConsumerListener {

    @SneakyThrows
    @StringConsumerCustomListener(groupId = "group-1")
    public void create(String messsage) {
       log.info("\nCREATE :: Received message {}", messsage);
       throw new IllegalArgumentException("EXCEPTION.........");
    }

    @StringConsumerCustomListener(groupId = "group-1")
    public void log(String messsage) {
        log.info("\nLOG :: Received message {}", messsage);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validateMessageContainerFactory")
    public void history(String messsage) {
        log.info("\nHISTORY :: Received message {}", messsage);
    }
}
