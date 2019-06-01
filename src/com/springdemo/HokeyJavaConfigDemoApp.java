package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HokeyJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HokeyConfig.class);

        //get the bean from the spring container
        Coach theCoach = context.getBean("hokeyCoach", HokeyCoach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());


        //close the context
        context.close();
    }
}
