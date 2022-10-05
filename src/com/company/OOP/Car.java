package com.company.OOP;

public class Car {

    String make;
    String model;
    int year;
    String VIN;
    int numberOfDoors;
    String color;
    static int minNumOfSeat=4;
     final String  WORLD_CAR="GEN";
     /*
     The static keyword means the value is the same for every instance of the class.
     The final keyword means once the variable is assigned a value it can never be changed
      */

    void startEngine(){
        System.out.println("The Engine started...");
    }

    void StopEngine(){
        System.out.println("The Engine stopped...");
    }

    void printCarInfo(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        System.out.println(VIN);



    }
}
