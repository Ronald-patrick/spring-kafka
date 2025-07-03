package com.ronald.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.ronald.kafka.config.AppConstants.LOCATION_TOPIC_NAME;

@Service
public class KafkaService {
    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        this.kafkaTemplate.send(LOCATION_TOPIC_NAME,location);
        this.logger.info("message produced");
        return true;
    }
}
