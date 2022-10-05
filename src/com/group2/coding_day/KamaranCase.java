package com.group2.coding_day;

public class KamaranCase {
    public static void main(String[] args) {
        String in="Hello World";

        System.out.println(reverse(in));
    }



//
//    String arr[]=in.split(" ");
//	for(int i =0;i<arr.length;i++) {
//        System.out.print(reverse(arr[i])+" ");




    public static String reverse(String word) {
        String rev="";
        for(int i=word.length()-1;i>=0;i--) {
            rev+=word.charAt(i);
        }

        return rev;

    }


}
