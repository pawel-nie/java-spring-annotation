package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean isEqual = theCoach == alphaCoach;
        if (isEqual) System.out.println("takie same");
        else System.out.println("zupelnie inne");

        System.out.println(theCoach.getDailyFortune());
        context.close();
    }


}
