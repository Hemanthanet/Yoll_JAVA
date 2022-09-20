package com.classmarker_review;

public class Day01 {
    public static void main(String[] args) {
        int a=7;
        int output= ++a + a++ + ++a;
        //a=7 --> ++a > a=8 then
        //now a=8
        //then 2 added to a that means a=11
        //so total is 8+8+10 =26
        System.out.println(output);
    }
}
