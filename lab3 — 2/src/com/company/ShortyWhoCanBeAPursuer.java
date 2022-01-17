package com.company;

public class ShortyWhoCanBeAPursuer extends Shorty implements CanBeAPursuer {


    final double speed;
    private double distanceToThePurpose;

    public ShortyWhoCanBeAPursuer(String name, double speed, double distanceToThePurpose){
        super(name);
        this.speed = speed;
        this.name = name;
        this.distanceToThePurpose = distanceToThePurpose;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public void toCheckTheDistanceToThePurpose(CanBeAPurpose canBeAPurpose){
        if (this.distanceToThePurpose <= 4){
            TurnAside turnAside = new TurnAside();
            turnAside.doReception(this, canBeAPurpose);
        }

    }


    @Override
    public void toCheckTheDistanceToThePurpose(CanBeAPursuer canBeAPursuer) {

    }

    public double getDistanceToThePurpose(){
        return this.distanceToThePurpose;
    }


    public void setDistanceToThePurpose(double distanceToThePurpose) {
        this.distanceToThePurpose = distanceToThePurpose;
    }



}