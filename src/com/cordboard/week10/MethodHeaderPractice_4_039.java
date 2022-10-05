package com.cordboard.week10;

public class MethodHeaderPractice_4_039 {

    /*
    Write a method header (public static) on line five with the following specs:
    Returns: an integer
    Name: addTwo
    Parameters:
            - An integer called "x"
            - An integer called "y"
    You should not be writing code on any line other than #2
     */

    //Write Your Code Here
    public static int addTwo(int x,int y){
        return x+y;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(addTwo(3, 4)); //should be 7
    }
}
