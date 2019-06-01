package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HokeyConfig {

    @Bean
    public FortuneService typicalFortuneService(){
        return new TypicalFortuneService();
    }

    @Bean
    public Coach hokeyCoach(){
        return new HokeyCoach(typicalFortuneService());
    }
}
