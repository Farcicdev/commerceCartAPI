package com.ecommerce.CommerceCartAPI.configteste;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoDebugConfig {

    @Bean
    CommandLineRunner mongoDebug(MongoTemplate mongoTemplate, Environment environment) {
        return args -> {
            System.out.println("=====================================");
            System.out.println("BANCO MONGO EM USO: " + mongoTemplate.getDb().getName());
            System.out.println("PROP spring.data.mongodb.database: " +
                    environment.getProperty("spring.data.mongodb.database"));
            System.out.println("PROP spring.data.mongodb.uri: " +
                    environment.getProperty("spring.data.mongodb.uri"));
            System.out.println("=====================================");
        };
    }
}