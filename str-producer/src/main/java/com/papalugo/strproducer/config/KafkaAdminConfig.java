package com.papalugo.strproducer.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Objects;

@Configuration
public class KafkaConfigAdmin {

    @Autowired
    public KafkaProperties properties;

    public KafkaAdmin kafkaAdmin {
        var configs = new HashMap<String, Object>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getBootstrapServers());

        return new KafkaAdmin(configs);
    }
}
