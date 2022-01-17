package com.company;

import java.util.TimerTask;


public class PursuerShortyTimerTask extends TimerTask {

    private final DogWhoCanBeAPurpose dogWhoCanBeAPurpose;
    private final ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer;
    private final Home home;
    private boolean moment;
    private int countOfTurnsAside;

    public PursuerShortyTimerTask(DogWhoCanBeAPurpose dogWhoCanBeAPurpose, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer, Home home, int countOfTurnsAside) {
        this.dogWhoCanBeAPurpose = dogWhoCanBeAPurpose;
        this.shortyWhoCanBeAPursuer = shortyWhoCanBeAPursuer;
        this.home = home;
        this.countOfTurnsAside = countOfTurnsAside;
    }



    @Override
    public void run(){

        this.moment = false;
        double distance = this.dogWhoCanBeAPurpose.getDistanceToThePursuer();
        if (distance <= 3){
            TurnAside turnAside = new TurnAside();
            turnAside.doReception(this.shortyWhoCanBeAPursuer, this.dogWhoCanBeAPurpose);

        }

        if ((!this.moment) & ((Math.random())*10 > 7)){
            this.moment = true;
            System.out.println("Our heroes ran into the flower bed near the house");
        }

        if (this.moment){
            this.shortyWhoCanBeAPursuer.toRunAroundTheHome(this.home);
            this.dogWhoCanBeAPurpose.toRunAroundTheHome(this.home);

        }


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


}
