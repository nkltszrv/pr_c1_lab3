package com.company;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        ShortyWhoCanBeAPursuer Neznaika = new ShortyWhoCanBeAPursuer("Neznaika", 4.0, 10);
        DogWhoCanBeAPurpose Milordick = new DogWhoCanBeAPurpose("Milordick", 6.0, true, 10);
        Shorty Feks = new Shorty("Feks", 1);


        FlowerBed flowerBedWithTulips = new FlowerBed(Flowers.TULIP, 1);
        FlowerBed flowerBedWithChamomiles = new FlowerBed(Flowers.CHAMOMILE, 2);
        FlowerBed flowerBedWithDaisies = new FlowerBed(Flowers.DAISY, 3);
        FlowerBed flowerBedWithPansies = new FlowerBed(Flowers.PANSY, 4);

        ArrayList<FlowerBed> environment = new ArrayList<>();
        Home home = new Home(4, environment );
        home.addFlowerBedToTheEnvironment(flowerBedWithChamomiles);
        home.addFlowerBedToTheEnvironment(flowerBedWithDaisies);
        home.addFlowerBedToTheEnvironment(flowerBedWithPansies);
        home.addFlowerBedToTheEnvironment(flowerBedWithTulips);


        Case case1 = new Case(0);


        case1.toTakeAnUnwantedTurn(Milordick, Neznaika, home, Feks);








    }
}
