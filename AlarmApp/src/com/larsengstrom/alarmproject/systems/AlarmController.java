package com.larsengstrom.alarmproject.systems;

public class AlarmController {

    //This class controls the central alarm and the alarm in the yard.
    public void activateCentralAlarm(){
        System.out.println("The central alarm has been activated");
    }

    public void resetCentralAlarm(){
        System.out.println("The central alarm has been reset.");
    }

    public void activateYardAlarm(){
        System.out.println("Something has activated the alarm in the yard.");
    }

    public void resetYardAlarm(){
        System.out.println("The alarm in the yard has been reset.");
    }

    public AlarmController() {
    }
}
