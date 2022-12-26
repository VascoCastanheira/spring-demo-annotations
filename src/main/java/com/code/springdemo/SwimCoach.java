package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters crawl.";
    }

    @Override
    @Qualifier("sadFortuneService")
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getTeamInfo() {
        return "The name of the team is: " + this.team + "\nAnd the email is: " + this.email;
    }


}
