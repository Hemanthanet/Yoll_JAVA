package com.cordboard.other_weeks;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int  itemPrice;
        int quarters=0;
        int dimes=0;
        int nickels=0;
        int change;

        System.out.println("Enter Item price");
        itemPrice=scn.nextInt();

        if(itemPrice>=25 && itemPrice<=100 && itemPrice%5==0)
        {
            change=100-itemPrice;
            System.out.println(change);
            if(change>=25)
            {
                quarters=change/25;
                change=change%25;

                {
                    if (change >= 10) {

                        dimes = change / 10;
                        nickels = change % 10;

                        if(change==5) {
                            nickels=change;

                    }




                    }

                }


                }
            System.out.println(quarters +"quaters and "+dimes+ "dimes and  "+nickels + " nickles ");



        }else
        {
            System.out.println("Invalid price!");
        }
    }
}

