package com.ronald.kafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.ronald.kafka.config.AppConstants.LOCATION_TOPIC_NAME;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(LOCATION_TOPIC_NAME)
//                .replicas()
//                .partitions()
                .build();
    }
}
