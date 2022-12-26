package com.code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.AccountNotFoundException;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach myCoach = context.getBean("surfCoach", Coach.class);
        Coach alphaCoach = context.getBean("surfCoach", Coach.class);

        boolean result = (myCoach == alphaCoach);

        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + myCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
    }
}
