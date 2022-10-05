package com.company.OOP;

public class StaticPractice {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.minNumOfSeat);
        car.minNumOfSeat=8;
        System.out.println(car.minNumOfSeat);
    }
}
