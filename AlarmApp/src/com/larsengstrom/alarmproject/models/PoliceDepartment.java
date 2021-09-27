package com.larsengstrom.alarmproject.models;

public class PoliceDepartment  extends Authority{

    //This class extends the authority class and overrides the scold method.
    @Override
    public void scold() {
        System.out.println("The police chief is very upset that you called in a false alarm. You're going to jail, buddy!");
    }

    public PoliceDepartment() {
    }
}
