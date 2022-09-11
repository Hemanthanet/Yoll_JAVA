package com.company.module04_loops;

import java.lang.ref.Reference;

public class FindSmallAndBigger {

    public static void main(String[] args) {
        /*
        //		Write a program that takes arrays of integers and compares them
//		int[]tempArray= {23, 44, 12, 99, 4};
//		Then prints the smallest one out of them.
         */
        int[]tempArray= {23, 44, 12, 99, 4};

        int minValue=tempArray[0];//int minValue=0; we can't use zero because if not have a negative  value
        int maxValue=tempArray[0];
        for (int i=0;i<tempArray.length;i++)
        {
            if(tempArray[i]<minValue)
            {
                minValue=tempArray[i];
            }

            if(tempArray[i]>maxValue)
            {
                maxValue=tempArray[i];
            }
        }
        System.out.println("min value = "+minValue);
        System.out.println("max value ="+maxValue);


        System.out.println("-----------using for each  loop -----------------");

        int min=tempArray[0];
        for(int num:tempArray){ // num is temp placeholder
            if(num<min){
                min=num;
            }
        }
        System.out.println("using each loop array min value ="+ min);
    }
}
