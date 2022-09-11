package com.company;

import java.util.Scanner;

public class JavaStore {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        double toyPrice;
        double nikeShoes=90.0; //hardcoded
        System.out.println("---WELCOME TO JAVA STORE---");
        System.out.println("How much money do you have in your wallet?");
        double wallet=scn.nextDouble();
        //dynemic  value
        System.out.println("Kid: Can I get this toy?");
        System.out.println("Me :How much does this cost?");
        toyPrice=scn.nextDouble(); //get dynamic toy price here

        if(toyPrice<=wallet)
        {
            System.out.println("Me :Sure !");
            wallet-=toyPrice;
        }
        else
        {
            System.out.println("Me :Sorry, I  have "+wallet+" left.");
        }
        //hardcode  calculation
        System.out.println("Kid: Can I get this Nike Shoes?");
        System.out.println("Me :How much does this cost?");
        System.out.println("It's" +nikeShoes + "$");

        if(nikeShoes<=wallet)
        {
            System.out.println("Me :Sure !");
            wallet-=nikeShoes;
        }
        else
        {
            System.out.println("Me: Sorry, I  have "+wallet+" left.");
        }

    }
}
