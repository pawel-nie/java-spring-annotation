package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "REST service";
    }
}
