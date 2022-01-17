package com.company;

public class Dog implements CanRun {


    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (speed != other.speed)
            return false;
        if (name != other.name)
            return false;
        return true;
    }





    protected final String name;
    private double speed;
    private boolean chain;
    private double distanceTravelled;

    public void untieTheChain(Shorty shorty) {
        this.chain = false;
        System.out.println(shorty.name + " untie the " + this.name + "'s chain");
    }


    public Dog(String name, double speed, boolean chain) {
        this.name = name;
        this.chain = chain;
        this.speed = speed;
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


    public void toRun() {
        this.distanceTravelled += this.speed*0.5;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void toBite(CanBeAPursuer canBeAPursuer){
        canBeAPursuer.getHurt();
    }


}
