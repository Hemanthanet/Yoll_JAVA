package com.group2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
    int a=10;
    int b=20;
   

    a=a+b;
    b=a-b;
    a=a-b;
        System.out.println(a);
        System.out.println(b);

    reverseString("hello");
        anagramText("text","extto");

    }


    public static void reverseString(String txt){
        String txtArr[]=txt.split("");
        for (int i = txtArr.length-1; i >=0 ; i--) {
            System.out.print(txtArr[i]);
        }
    }
    
    public static void anagramText(String text1,String text2){
        char text1Arr[]=text1.toCharArray();
        char text2Arr[]=text2.toCharArray();
        Arrays.sort(text1Arr);
        Arrays.sort(text2Arr);
        System.out.println(Arrays.equals(text1Arr, text2Arr));
                
            }



}


