package com.love2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("Do start up stuff in: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("Do clean up stuff in: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for 15 minutes";
    }
}
