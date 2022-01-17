package com.company;

public class Shorty implements CanRun {


    private double speed;
    protected String name;
    private double distanceTravelled;


    @Override
    public int hashCode() {
        int speedy = (int) this.speed;
        return name.hashCode() * 101 + speedy;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Shorty other = (Shorty) obj;
        if (name != other.name)
            return false;
        return true;
    }




    public Shorty(String name, double speed){
        this.speed = speed;
        this.name = name;
    }

    public Shorty(String name){
        this.name = name;
    }




    public void getHurt(){
        System.out.println(this.name + ": \"Ouch!\"");
    }

    public double getSpeed(){
        return this.speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public void untieTheDogChain(Dog dog){
        dog.untieTheChain(this);
    }



    public void toRun(){
        this.distanceTravelled += this.speed*0.5;
    }

    public void damageTheFlowerBed(FlowerBed flowerBed, WayToBeRippedOut wayToBeRippedOut, FromWhatToBeRippedOut fromWhatToBeRippedOut){
        flowerBed.beRippedOut(wayToBeRippedOut, fromWhatToBeRippedOut, this);
    }

    public void toRunAroundTheHome(Home home){
        int countOfFlowerBeds = home.getSizeOfEnvironment();
        int numberInArray = (int) (Math.random()*countOfFlowerBeds);
        FlowerBed flowerBed = (FlowerBed) home.getFlowerBedElement(numberInArray);
        this.damageTheFlowerBed(flowerBed, WayToBeRippedOut.WITH_ROOT, FromWhatToBeRippedOut.FROM_LEGS);
    }

}

