package com.cordboard;

public class Custom_Array_05 {
    public static void main(String[] args) {

        /*
 Each item in an array is called an _element_, and each element is accessed by its numerical _index_.
 Numbering begins with 0. The 9th element, for example, would therefore be accessed at index 8.

                        Instructions:

                        - Write a program that creates an array of integers
                        - Allocate memory for 10 integers
                        - Initialize first element and assign value to it: 100
                        - Initialize second element and assign value to it: 200
                        - and so forth
                        - Print each value on separate lines:

                       "Element at index 0: 100"
                       "Element at index 1: 200"
                        ... and so forth...
                       "Element at index 9: 1000"
               */

        int arr[]=new int[10];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;
        arr[5]=600;
        arr[6]=700;
        arr[7]=800;
        arr[8]=900;
        arr[9]=1000;
        System.out.println("Element at index 0: "+arr[0]);
        System.out.println("Element at index 1: "+arr[1]);
        System.out.println("Element at index 2: "+arr[2]);
        System.out.println("Element at index 3: "+arr[3]);
        System.out.println("Element at index 4: "+arr[4]);
        System.out.println("Element at index 5: "+arr[5]);
        System.out.println("Element at index 6: "+arr[6]);
        System.out.println("Element at index 7: "+arr[7]);
        System.out.println("Element at index 8: "+arr[8]);
        System.out.println("Element at index 9: "+arr[9]);


        //option 2

        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+ i+": "+arr[i]);
        }




    }
}
