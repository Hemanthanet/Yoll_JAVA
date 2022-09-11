package com.company.methods;

public class Lesson2_02 {
    public static void main(String[] args) {

        int result1=findDifferent(23 ,87);
        int result2= findDifferent(44 ,567);
        System.out.println(" multiply by result ="+ result1*result2);
        System.out.println(" result as argument "+ findDifferent(result1, result2));

    }

    public static int findDifferent(int num1,int num2)
    {
        int diff=0;
        if(num1>num2){
            diff=num1-num2;
        }else
        {
            diff=num2-num1;
        }
        return diff;
    }
}
