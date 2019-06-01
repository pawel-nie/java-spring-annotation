package com.springdemo;

public class HokeyCoach implements Coach{

    private FortuneService fortuneService;

    public HokeyCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Get on ice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
