package com.code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class RandomFortuneService implements FortuneService {
    private String[] fortuneStrings = {"This day you will progress!",
            "This day you will stagnate!",
            "This day you will regress!"};

    public RandomFortuneService(){
    }

    @Override
    public String getFortune() {
        int rng = 0;
        Random random  = new Random();
        rng = random.nextInt(fortuneStrings.length);
        return fortuneStrings[rng];
    }
}
