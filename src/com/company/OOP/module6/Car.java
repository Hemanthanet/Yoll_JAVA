package com.company.OOP.module6;

public class Car {

    // State - (Attributes, Data, Fields, Instance Variables)
    // The modifiers as public and static are optional here
    // It is optional to initialize the Instance variable
    private String make;
    private String model;
    private int year;
    public int numberOfDoors;
    public String color;
    public double tankCapacity;
    // In some cases we want to give an initial value to a filed
    public String VIN = "XXXXXXXXXXXXX";
    // This is a constant that we need to initialize at the beginning and each object will have the same value for the field
    public final static String DEALERSHIP = "1Cochran";
    public static int countCars;

    //this is the default constructor
    public Car(){
        System.out.println("New Object has been created !");
        countCars++;
        year=2022;
        tankCapacity=25;
    }

    //second constructor
    //public Car(String String int int String double String  )


    public void printInfo() {
        System.out.println("-----------------------");
        System.out.println("Dealership: " + DEALERSHIP);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("VIN: " + VIN);
        System.out.println("Color: " + color);
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("-----------------------");
    }


    // Behavior - (Methods, Functions)
    // It is optional to use public or static modifiers
    public void startEngine() {
        System.out.println("The engine started...");
    }

    public void stopEngine() {
        System.out.println("The engine stopped...");
    }

    // we can also have methods with return
    // also we can take arguments
    public double fullTankCost(double fuelPrice) {
        return Math.round(tankCapacity * fuelPrice);
    }




}