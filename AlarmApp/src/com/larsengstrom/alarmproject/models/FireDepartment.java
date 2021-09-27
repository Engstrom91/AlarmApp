package com.larsengstrom.alarmproject.models;

public class FireDepartment extends Authority{

    //This class extends the authority class and overrides the scold method.
    @Override
    public void scold() {
        System.out.println("The fire chief is very upset that you called in a false alarm. He decides that as a punishment, the firefighters will do their next fire practice in your yard.");
    }


    public FireDepartment() {
    }
}
