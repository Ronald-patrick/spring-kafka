package com.ronald.kafka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.ronald.kafka.config.AppConstants.GROUP_ID;
import static com.ronald.kafka.config.AppConstants.LOCATION_TOPIC_NAME;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = LOCATION_TOPIC_NAME, groupId = GROUP_ID )
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
