package com.larsengstrom.alarmproject.systems;

import java.util.Random;

public class LocationPicker {

    //This class sets the location that is used in a crisis simulation.
private String[] locations = {">Window, Ground Floor<", ">Window, Top Floor<", ">Window, Garage<", ">Window, Basement<", ">Ground Floor, Main Door<", ">Ground Floor, Kitchen Door<", ">Garage, Side Door<", ">Garage, Main Door<", ">Basement, Main Door<"};
private Random random = new Random();


    private int getRandomItem(String[] array){
        int randomIndex;
        randomIndex = random.nextInt(array.length);
        return randomIndex;
    }

    public void pickLocation(){
        int randomLocation = getRandomItem(locations);
        System.out.println("Warning! A crisis is happening near " + locations[randomLocation]);
    }


    public LocationPicker() {
    }

    public LocationPicker(String[] locations, Random random) {
        this.locations = locations;
        this.random = random;
    }

    public String[] getLocations() {
        return locations;
    }

    public Random getRandom() {
        return random;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
