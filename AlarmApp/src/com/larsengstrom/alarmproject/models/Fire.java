package com.larsengstrom.alarmproject.models;

public class Fire implements Crisis{

    //The fire class implements the crisis interface and produces different output than the burglary class
    @Override
    public void worsen() {
        System.out.println("Sorry! Your house burned down. Hope you can win the lottery again soon and buy a new one.");
    }

    @Override
    public void improve() {
        System.out.println("The fire was put out. Good job!");
    }

    public Fire() {
    }
}
