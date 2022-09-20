package com.cordboard.week09;

import java.util.Scanner;

public class DoWhileShoppingCart {
    public static void main(String[] args) {
        /*
    In this assignment, you will write a program that will generate a shopping list.
    It's more advanced version of assignment #22 (Shopping list I).
    Your program should ask use to enter items followed by its price.
    After adding item, ask user if he wants to add one more item.
    If Yes, repeat previous steps again.
    If no, print shopping list report and total price as show in examples.
    Your program should accept up to 10 items.
    Hint: use do while loop.
         */

        Scanner scan = new Scanner(System.in);
        //Write Your Code Here

        String isContinued="YES";
        String itemList="";
        int numOfTime=0;
        double totalPrice=0.0;
        do{
            numOfTime++;
            System.out.println("Enter Item"+numOfTime+" and its price:");
            String itemName=scan.next(); //get item name
            double itemPrice=scan.nextDouble();//get item price
            itemList+="Item"+numOfTime+": "+itemName +" Price: "+itemPrice+", ";
            //Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
            totalPrice+=itemPrice;

            System.out.println("Add one more item?");
            isContinued=scan.next();


        }while(isContinued.equalsIgnoreCase("yes") && numOfTime<10 );

        // _output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0_
        System.out.println(itemList);

        //_output: Total price: 8.3_
        System.out.println("Total price: "+totalPrice);
    }


}
