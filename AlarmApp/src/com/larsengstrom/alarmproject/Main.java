package com.larsengstrom.alarmproject;

import java.util.Scanner;

import com.larsengstrom.alarmproject.models.Burglary;
import com.larsengstrom.alarmproject.models.Fire;
import com.larsengstrom.alarmproject.models.FireDepartment;
import com.larsengstrom.alarmproject.models.PoliceDepartment;
import com.larsengstrom.alarmproject.systems.AlarmController;
import com.larsengstrom.alarmproject.systems.LocationPicker;

public class Main {


    public static void main(String[] args) {
        //Systems
        AlarmController alarmController = new AlarmController(); //This object starts and resets the alarm. There are separate methods that control the alarm in the yard.
        LocationPicker locationPicker = new LocationPicker(); //This generates a random location for each crisis.
        Scanner scanner = new Scanner(System.in); //The scanner lets us store input from the user.

        //Models
        Burglary burglary = new Burglary(); //The burglary class has two methods that print out what happens when the situation improves or worsens.
        Fire fire = new Fire(); //The fire class has two methods that print out what happens when the situation improves or worsens.
        PoliceDepartment policeDepartment = new PoliceDepartment(); //The police department can either respond to a crisis or scold the user for calling in a false alarm.
        FireDepartment fireDepartment = new FireDepartment(); //The fire department can either respond to a crisis or scold the user for calling in a false alarm.

            int input;
        System.out.println("\n \uD83C\uDFE2 \uD83C\uDFE2 CREATED BY LARS' ALARM SYSTEMS \uD83C\uDFE2 \uD83C\uDFE2 ");

        //This loop holds the menu for the alarm system
        while (true) {
            System.out.println("\n \uD83D\uDEA8 \uD83D\uDEA8 Welcome to the alarm terminal \uD83D\uDEA8 \uD83D\uDEA8 "); //We create a new line since the terminal gets really cluttered if we don't.
            System.out.println("|| What would you like to do? (0)Simulate a burglary (1)Simulate a fire (2)Report a real crisis (3)Call in a false alarm ||");
            input = scanner.nextInt();
        switch (input) {
            case 0 :
                System.out.println("\uD83D\uDD2B Simulating burglary. \uD83D\uDD2B");
                alarmController.activateYardAlarm();
                locationPicker.pickLocation();
                alarmController.activateCentralAlarm();
                System.out.println("|| What would you like to do? (0) Alert the police (1)  Reset the alarm and ignore the crisis ||");
                input = scanner.nextInt();
                switch(input) {
                    case 0:
                        policeDepartment.respondToCrisis();
                        burglary.improve();
                        alarmController.resetYardAlarm();
                        alarmController.resetCentralAlarm();
                        break;
                    case 1:
                        alarmController.resetYardAlarm();
                        alarmController.resetCentralAlarm();
                        burglary.worsen();
                        break;
                }
                break;

            case 1:
                System.out.println("\uD83D\uDD25 Simulating fire. \uD83D\uDD25");
                locationPicker.pickLocation();
                alarmController.activateCentralAlarm();
                System.out.println("|| What would you like to do? (0) Alert the fire department (1) Reset the alarm and ignore the crisis ||");
                input = scanner.nextInt();
                switch(input) {
                    case 0:
                        fireDepartment.respondToCrisis();
                        fire.improve();
                        alarmController.resetCentralAlarm();

                        break;
                    case 1:
                        alarmController.resetCentralAlarm();
                        fire.worsen();
                        break;
                }
                break;

            case 2:
                System.out.println("|| What's your emergency? (0)Burglary (1)Fire ||");
                input = scanner.nextInt();
                switch(input) {
                    case 0:
                        System.out.println("|| What would you like to do? (0)Alert the police department (1) Reset the alarm and ignore the crisis ||");
                        input = scanner.nextInt();
                        switch(input) {
                            case 0:
                                alarmController.activateCentralAlarm();
                                policeDepartment.respondToCrisis();
                                burglary.improve();
                                break;
                            case 1:
                                alarmController.resetCentralAlarm();
                                burglary.worsen();
                                break;
                        }
                        break;
                    case 1:
                        System.out.println("|| What would you like to do? (0)Alert the fire department (1)Reset the alarm and ignore the crisis ||");
                        input = scanner.nextInt();
                        switch(input) {
                            case 0:
                                alarmController.activateCentralAlarm();
                                fireDepartment.respondToCrisis();
                                fire.improve();
                                alarmController.resetCentralAlarm();
                                break;
                            case 1:
                                fire.worsen();
                                break;
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("|| Who would you like to call? (0) Police Department (1) Fire Department ||");
                input = scanner.nextInt();
                switch(input) {
                    case 0:
                        alarmController.activateCentralAlarm();
                        policeDepartment.scold();
                        alarmController.resetCentralAlarm();
                        break;
                    case 1:
                        alarmController.activateCentralAlarm();
                        fireDepartment.scold();
                        alarmController.resetCentralAlarm();
                        break;
                }
                break;

            default:
                System.out.println("|| I'm afraid I can't do that. Please provide a valid input ||");
        }
        }
        }
    }

