package com.CodingBat_code_practice;

public class TheEnd {
    public static void main(String[] args) {
        String str="Hea";
        System.out.println(str.length()); // this starts from 1,2,3
        System.out.println(str.charAt(str.length()-1)); // but char at starts from 0  so we need t0  get length -1
        System.out.println(str.charAt(str.length()-2));
        System.out.println(str.charAt(str.length()-3));
        System.out.println("-----");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        boolean front=false;
        if((!str.isEmpty() && front) == true)
        {
            System.out.println(String.valueOf(str.charAt(0)));

        }else
        {
            System.out.println(String.valueOf(str.charAt(str.length()-1)));
        }
    }
}
