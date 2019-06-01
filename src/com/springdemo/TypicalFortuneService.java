package com.springdemo;

public class TypicalFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "This is your typical daily fortune";
    }
}
