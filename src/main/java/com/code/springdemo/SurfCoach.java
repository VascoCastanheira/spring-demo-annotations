package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SurfCoach implements Coach {
    @Autowired
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

/*    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("SurfCoach: inside setter method setFortuneService.");
        this.fortuneService = theFortuneService;
    }*/
}
