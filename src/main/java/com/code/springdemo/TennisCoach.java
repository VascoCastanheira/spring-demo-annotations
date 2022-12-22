package com.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your smash for 30 minutes!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

}
