package com.code.springdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.List;
import java.util.Random;

@Component
public class RandomFromFileFortuneService implements FortuneService {

    private List<String> fortuneStrings;

    public RandomFromFileFortuneService() {
    }

    //innit method
    public void doMyStartupStuff() {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("fortunes.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                // read next line
                fortuneStrings.add(reader.readLine());
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @Override
    public String getFortune() {
        int rng = 0;
        Random random = new Random();
        rng = random.nextInt(fortuneStrings.size());
        System.out.println(fortuneStrings.get(rng));
        return fortuneStrings.get(rng);
    }
}
