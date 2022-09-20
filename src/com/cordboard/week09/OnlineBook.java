package com.cordboard.week09;

import java.util.Scanner;

public class OnlineBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you Premium Customer?");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("How many books did you purchase?");
        int nbooksPurchased = scan.nextInt();
        /*
        Instructions from your teacher:

# Online Book Merchants offers premium customers 1 free book
with every purchase of 5 or more books and offers 2 free books with every purchase of 8 or more books.

It offers regular customers 1 free book with every purchase of 7 or more books, and offers 2 free books
 with every purchase of 12 or more books.

# Write a program that assigns freeBooks the appropriate value based on the values of the
boolean variable isPremiumCustomer and the int variable nbooks Purchased.
Print amount of freeBooks into the console.
         */
        // your code here

            int nfreeBook = 0;

            if (isPremiumCustomer) //premium customers
            {
                if (nbooksPurchased < 5) {
                    nfreeBook = 0;
                } else if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
                    nfreeBook = 1;
                } else if (nbooksPurchased >= 8) {
                    nfreeBook = 2;
                }

            } else  //regular customer
            {
                if (nbooksPurchased < 7) {
                    nfreeBook = 0;
                } else if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
                    nfreeBook = 1;
                } else if (nbooksPurchased >= 12) {
                    nfreeBook = 2;
                }
            }
            System.out.println(nfreeBook);



    }
}
