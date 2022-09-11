package com.CodingBat_code_practice;

public class Riight2 {

    public static void main(String[] args) {
        String str="Javasdafdadf";
//        String first=str.substring(str.lastIndexOf (2),str.length());
//        String last=str.substring(0,str.lastIndexOf(2));
//        System.out.println(first+last);
        int noOfIndex=str.length();
        System.out.println(str.charAt(noOfIndex-2));
        String firstpart=str.substring(0,str.length()-2);
        String  last=str.substring(str.length()-2,str.length());
        System.out.println(firstpart);
        System.out.println(last);

        //System.out.println(str.lastIndexOf(2));

    }
}
