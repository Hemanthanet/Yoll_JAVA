package com.company.module04_loops;

public class PrintShapeWithNestedLoop {
    public static void main(String[] args) {
//        for(int i=1;i<=3;i++){
//
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+ "\t");
            }
            System.out.println();

        }



    }
}
