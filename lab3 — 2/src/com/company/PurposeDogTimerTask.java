package com.company;

import java.util.TimerTask;

public class PurposeDogTimerTask extends TimerTask {

    private final CanBeAPurpose canBeAPurpose;
    private final CanBeAPursuer canBeAPursuer;


    public PurposeDogTimerTask(DogWhoCanBeAPurpose dogWhoCanBeAPurpose, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer) {
        this.canBeAPurpose = dogWhoCanBeAPurpose;
        this.canBeAPursuer = shortyWhoCanBeAPursuer;
    }



    public void run(){
        this.canBeAPurpose.runForOrCatchingUp(this.canBeAPursuer);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }









}
