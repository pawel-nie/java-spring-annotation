package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    @PostConstruct
    public void doSomeCreateStuff(){
        System.out.println("inside @PostConstruct method");
    }

    @PreDestroy //to sie nie wywola dla prototypow
    public void doSomeCleanupStuff(){
        System.out.println("inside @PreDestroy method");
    }

    public TennisCoach(){
        System.out.println("TennisCoach: inside default constructor");
    }

    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService){
        System.out.println("TennisCoach: inside doSomeCrazyStuff");
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired
    public TennisCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

}
