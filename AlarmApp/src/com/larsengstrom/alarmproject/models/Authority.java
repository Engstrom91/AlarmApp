package com.larsengstrom.alarmproject.models;

public abstract class Authority {

    //An authority can either respond to a crisis or scold the user for calling in a false alarm.
    public void respondToCrisis(){
        System.out.println("The authorities have been alerted to your crisis and help is on the way!");
    }

    public void scold(){}

    public Authority() {
    }


}
