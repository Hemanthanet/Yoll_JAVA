package com.company.OOP;

public class DayOne_02_House {
    public static void main(String[] args) {
        House myHouse=new House();


        myHouse.numberOfStories=4;
        myHouse.numberOfWindows=2;
        myHouse.numberOfRooms=2;
        myHouse.yearBuilt=2;
        myHouse.address="123, Test Avenue 00000 NY ";
        myHouse.hasPool=true;
        myHouse.hasPatio=false;

        myHouse.printHouseDetails();


    }
}
