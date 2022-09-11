package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // Scanner scn= new Scanner(System.in);
//        double discountPrice;
//        System.out.println("Enter Customer name : ");
//        String custName=scn.next();
//        System.out.println("Enter Item Price in Dollars and price  : ");
//        Double  custItemPriceDollar=scn.nextDouble();
//        System.out.println("Enter Item Descount precentage(5,10,20..%)  : ");
//        int precentage=scn.nextInt();
//
//        //calculate the discount
//        double deduct=custItemPriceDollar*precentage/100;
//
//
//        discountPrice=custItemPriceDollar-deduct;
//        System.out.println("Deduct value " +deduct );
//        System.out.println("Thank you  "+ custName + "Your tatal after discount is "+discountPrice);
//

//        int apple =10;
//        ++apple;
//        System.out.println(apple);
//        apple++;
//        System.out.println(apple);


        int a,b;
        a=100;
        b=200;

        System.out.println(a++ + ++a); //100 + (101+1) a=202
        System.out.println(a-- - --a);//202 - (200-2) a=200
        System.out.println(b++  + b++); // 200 + (200+1)=401 b=202

        System.out.println(a);
        System.out.println(b);


        // negating expression
        boolean isCold=false;
        boolean isEmpty=!false;
        System.out.println(isCold);
        System.out.println(isEmpty);

        //negate a number
        int positiveVal=100;
        System.out.println(-positiveVal);

        //realtional operators
        // == >=  <=

        boolean isEqual =25==25;
        System.out.println(isEqual);

        int num=-100;
        System.out.println(+num);

        int ab=100;
        boolean isMorthan=a++>100;
        System.out.println(isMorthan);

        System.out.println(200<201);
        boolean isLessthan=num<102;
        System.out.println(isLessthan);





    }
}
