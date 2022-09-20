package com.cordboard.week08;

import java.util.Scanner;

public class Recrusion_task {
    public static void main(String[] args) {
        /*
        Imagine you have 10 flowers in the vase
        Write a recursive method that will decrease flower each time and print each time how many remaining
        Lastly, it should print: Vaze is now empty
         */
        Scanner scn=new Scanner(System.in);
        flowers(scn.nextInt());


    }




    public static void flowers(int count) {

        if(count>=1) {
            System.out.println("The remaining is: " + count);
            flowers(count-1);
        }else if(count == 0) {
            System.out.println("Vaze is now empty");
        }
//
//        public static void flowers1(int count1){
//            if (count1 >= 1) {
//                System.out.println(count + " flowers remaining");
//                flowers(count1 - 1);
//            } else if (count1 == 0) {
//                System.out.println("Vase is empty");
//            }
//        }
//
//
//        public static void flowers(int a){
//
//            System.out.println(a + "flowers left");
//
//            if (a <= 0) {
//                return;
//            }
//
//            flowers(a - 1)
//        }
//
//
//
//
//
//        public static void emptyVaze(int numberOfFlowers) {
//            if(numberOfFlowers>0) {
//                System.out.println(numberOfFlowers);
//                numberOfFlowers--;
//                emptyVaze(numberOfFlowers);
//            }
//            else {
//                System.out.println("Vaze is empty");
//            }
//        }
//
//
//
//        public static void flowers3(int count2) {
//
//            if(count<0) {
//                System.out.println("Vaze is now empty");
//                return;
//            }
//            System.out.println("you have "+count2+" remaning flowers");
//            flowers(count2-1);
//
//        }
    }

}

