package com.company.methods;

public class Task01 {
    public static void main(String[] args) {
        int variable1=30;
        printResult();


    }

    public static void  printResult(){
        // System.out.println(varible1);  out of scope  so we can't call outside variable to this method
        int a=5;
        int b=40;
        int result=a*b;
        System.out.println(result);

    }
}
