package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Case extends Situation {


    @Override
    public String toString() {
        return "case lol";
    }

    private Timer timer;


    public void toTakeAnUnwantedTurn(DogWhoCanBeAPurpose dogWhoCanBeAPurpose, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer, Home home, Shorty shorty){
        System.out.println("The case had take an unwanted turn");
        shorty.untieTheDogChain(dogWhoCanBeAPurpose);
        this.setTimer(dogWhoCanBeAPurpose, shortyWhoCanBeAPursuer, home);
    }



    public Case(long timeToStart){
        this.timeToStart = timeToStart;
    }


    public void setTimer(DogWhoCanBeAPurpose dogWhoCanBeAPurpose, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer, Home home) {
        TimerTask timerTaskDog = new PurposeDogTimerTask(dogWhoCanBeAPurpose, shortyWhoCanBeAPursuer);
        TimerTask timerTaskShorty = new PursuerShortyTimerTask(dogWhoCanBeAPurpose, shortyWhoCanBeAPursuer, home, 0);
        Timer timer1 = new Timer();
        this.timer = timer1;
        Timer timer2 = new Timer();
        this.timer = timer2;
        timer1.schedule(timerTaskDog, this.timeToStart, 500);
        timer2.schedule(timerTaskShorty, this.timeToStart,  500);


    }



}
