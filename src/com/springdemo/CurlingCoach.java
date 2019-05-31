package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CurlingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Move some stones";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
