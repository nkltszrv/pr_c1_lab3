package com.company;

public class DogWhoCanBeAPurpose extends Dog implements CanBeAPurpose{

    private double distanceToThePursuer;
    public DogWhoCanBeAPurpose(String name, double speed, boolean chain, double distanceToThePursuer) {
        super(name, speed, chain);
        this.distanceToThePursuer = distanceToThePursuer;
    }

    public double getDistanceToThePursuer() {
        return this.distanceToThePursuer;
    }



    public void setDistanceToThePursuer(double distance){
        this.distanceToThePursuer = distance;
    }

    public void runForOrCatchingUp(CanBeAPursuer canBeAPursuer){
        double distance2;
        double dogSpeed = this.getSpeed();
        double shortySpeed = canBeAPursuer.getSpeed();
        double distance = this.getDistanceToThePursuer();
        distance2 =  distance - (dogSpeed - shortySpeed) * 0.5;
        this.setDistanceToThePursuer(distance2);
        canBeAPursuer.setDistanceToThePurpose(distance2);
        if (distance <=0){
            this.toCatchUp(canBeAPursuer);
        }
        System.out.println("New distance between purpose and pursuer: " + distance);
    }



    public void toCatchUp(CanBeAPursuer canBeAPursuer ) {
        String shortyName = canBeAPursuer.toString();
        System.out.println(this.name + " catch the " + shortyName);
        this.toBite(canBeAPursuer);
    }
}
