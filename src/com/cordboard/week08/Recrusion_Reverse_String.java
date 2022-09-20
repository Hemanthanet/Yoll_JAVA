package com.cordboard.week08;

public class Recrusion_Reverse_String {
    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
    }

    public static  String reverseString(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
}
