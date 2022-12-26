package com.code.springdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SurfCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public SurfCoach() {
        System.out.println("SurfCoach: inside default method constructor.");
    }

    /*    @Autowired
        public SurfCoach(FortuneService theFortuneService){
            this.fortuneService = theFortuneService;
        }*/
    @Override
    public String getDailyWorkout() {
        return "Practice cutback for 1st heat training!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getTeamInfo() {
        return null;
    }

    //init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("SurfCoach: Inside innit method");
    }
    //destroy method
    @PreDestroy
    public void doMyDeleteStuff(){
        System.out.println("SurfCoach: Inside destroy method");
    }
/*    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("SurfCoach: inside setter method setFortuneService.");
        this.fortuneService = theFortuneService;
    }*/
}
