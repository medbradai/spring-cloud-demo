package com.neoxia.springaws.config;

import com.amazonaws.services.sns.AmazonSNS;
import org.springframework.cloud.aws.core.env.ResourceIdResolver;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnsConfig {

    @Bean
    public NotificationMessagingTemplate notificationMessagingTemplate(AmazonSNS amazonSNS, ResourceIdResolver resourceIdResolver) {
        return new NotificationMessagingTemplate(amazonSNS, resourceIdResolver);
    }
}
