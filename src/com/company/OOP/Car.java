package com.company.OOP;

public class Car {

    String make;
    String model;
    int year;
    String VIN;
    int numberOfDoors;
    String color;

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
