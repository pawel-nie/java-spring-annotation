package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.springdemo")
public class SportConfig {

    //define a bean for a sad fortune
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define a bean for swim coach and dependency injection
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
