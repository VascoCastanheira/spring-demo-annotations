package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //create content
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //get beans
        Coach myTennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach mySurfCoach = context.getBean("surfCoach", Coach.class);
        //do methods on beans
        System.out.println(myTennisCoach.getDailyWorkout());
        System.out.println(mySurfCoach.getDailyWorkout());
        System.out.println(mySurfCoach.getDailyFortune());
        System.out.println();

        //close context
        context.close();
    }
}
