package com.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String [] fortunes = {
            "Fortune 1",
            "Fortune 2",
            "Fortune 3",
            "Fortune 4",
            "Fortune 5"
    };

    private Random randomIndex = new Random();

    @Override
    public String getDailyFortune() {

        return fortunes[randomIndex.nextInt(fortunes.length)];
    }
}
