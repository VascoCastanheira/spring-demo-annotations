package com.code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach myCoach = context.getBean("swimCoach", Coach.class);
        Coach alphaCoach = context.getBean("swimCoach", Coach.class);

        boolean result = (myCoach == alphaCoach);

        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + myCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getTeamInfo());
    }
}
