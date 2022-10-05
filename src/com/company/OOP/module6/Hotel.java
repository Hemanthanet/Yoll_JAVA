package com.company.OOP.module6;

public class Hotel {


    /*
    Create a class called: Hotel
    Create instance variables: numberOfApartments, numberOfStars, name, hasPool;
    Create an object called Marriott - with default constructor
    Create an object called Hyatt - with all the values as paramaters
    Means you have to create parameterized constructor
     */
    public int numberOfApartments;
    public int numberOfStars;
    public String name;
    public boolean hasPool;


    //default constructor
    public Hotel()
    {

    }

    //this is the second parameters
    public Hotel(int numberOfApartments,int numberOfStars,String name,boolean hasPool){
       this.numberOfApartments=numberOfApartments;
       this.numberOfStars=numberOfStars;
       this.name=name;
       this.hasPool=hasPool;
    }

    public static void main(String[] args) {
        Hotel Marriott=new Hotel(); //with the default constructor
        Hotel Hyatt=new Hotel(5,4,"Hyatt_01",true);

        System.out.println(Marriott.name);//null because this comes from default constructor
        System.out.println(Marriott.hasPool);
        System.out.println(Hyatt.hasPool);

        //with the method
        System.out.println(Hotel(6));

    }

    public static int  Hotel(int numberOfApartments)
    {
       return numberOfApartments;
    }
}
