package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
@PropertySource("classpath:fileFortunes")
public class FileFortuneService implements FortuneService{

    @Value("${firstFortuneService}")
    private String firstFortune;

    @Value("${secondFortuneService}")
    private String secondFortune;

    private String [] fortunesArray;

    @PostConstruct
    public void populateArray() {
        fortunesArray = new String[2];
        fortunesArray[0] = firstFortune;
        fortunesArray[1] = secondFortune;
    }

    @Override
    public String getDailyFortune() {
        Random randomIndex = new Random();
        return fortunesArray[randomIndex.nextInt(fortunesArray.length)];
    }
}
