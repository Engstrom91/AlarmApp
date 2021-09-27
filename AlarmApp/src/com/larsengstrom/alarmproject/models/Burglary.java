package com.larsengstrom.alarmproject.models;

public class Burglary implements Crisis{

    //The burglary class implements the crisis interface and produces different output than the fire class
    @Override
    public void worsen() {
        System.out.println("The burglars took all your valuables and you can't afford to stay in the mansion anymore. Better luck next time!");
    }

    @Override
    public void improve() {
        System.out.println("The police arrived and caught the burglars. Good job!");
    }

    public Burglary() {}
}
