package com.company.OOP;

public class DayOne_01_Car {

    public static void main(String[] args) {
        Car myCar=new Car();
        Car omarsCar=new Car();

        myCar.startEngine();

        myCar.make="NISSAN";
        myCar.model="Versa";
        myCar.VIN="NKHJUIYTH76J";
        myCar.year=2012;
        myCar.color="Black";
        myCar.numberOfDoors=4;

        //omar's car

        omarsCar.make="Honda";
        omarsCar.model="Fit";
        omarsCar.VIN="HUJDKM8795K";
        omarsCar.year=2017;
        omarsCar.color="RED";
        omarsCar.numberOfDoors=4;

        myCar.printCarInfo();
        System.out.println("-------");
        omarsCar.printCarInfo();






    }
}
