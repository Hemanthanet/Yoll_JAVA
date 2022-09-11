package com.company.methods;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Create an array with cities:
                "New York", "London", "Baku", "Istanbul", "Baku", "Los Angeles", "London", "Baku"
                Create a method that gets an array of strings and a string
                It counts how many times a string appears in the array and prints the count.
                E.g:
                String [] cities;
                cityFinder(cities, "Baku");
         */
        Scanner scn= new Scanner(System.in);
        String sampleArray[]={"New York", "London", "Baku", "Istanbul", "Baku", "Los Angeles", "London", "Baku","Colombo"};
        System.out.println("Enter your city  : ");
        String searchCity=scn.next();
        cityFinder(sampleArray, searchCity);

    }
    public static void cityFinder(String cities[],String city){
        int cityCount=0;
        for(int i=0;i<cities.length;i++){
            if(cities[i].equals(city)){
                cityCount++;
            }
        }
        System.out.println("We found "+city +" count as "+cityCount);
    }
}
