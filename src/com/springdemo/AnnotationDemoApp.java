package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theCurlingCoach = context.getBean("curlingCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCurlingCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
