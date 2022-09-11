package com.company;

import java.util.Arrays;

public class ReCapArray {

    public static void main(String[] args) {

        int [] oneToTen;//initiate  an array
        oneToTen=new int[] {1,2,3,4,5,6,7,8,9,10}; //values assigned

        //other ways
        String [] name ={"Hemantha","jayasundara","Priyangika","Divakara"};

        //Array operations

        //get vales from array
        System.out.println(oneToTen[0]+ " is the zeroth of index and first element of the array");
        System.out.println(name[1]+ "is the second element of the name array ");

        //assign a values to array element
        name[1]="Mudiyanselage";
        System.out.println(name[1] + " has changed after assigning new value");

        //print whole array  using Arrays Class
        System.out.println(Arrays.toString(name)); // here is the whole array print
        System.out.println(Arrays.toString(oneToTen));





    }
}
