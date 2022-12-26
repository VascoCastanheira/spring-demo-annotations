package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("surfCoach", Coach.class);
        Coach alphaCoach = context.getBean("surfCoach", Coach.class);

        boolean result = (myCoach == alphaCoach);

        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + myCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
    }
}
