package com.venkatesh.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// To create topic form springboot itself than cli
@Configuration
public class KafkaProducerConfig {
    @Bean
    public NewTopic createTopic(){
        return new NewTopic("kafka-demo3",3,(short) 1);
    }
}
