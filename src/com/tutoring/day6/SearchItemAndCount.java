package com.tutoring.day6;

public class SearchItemAndCount {
    public static void main(String[] args) {

        /**
         * Count occurrences of elements in an array
         *  "no value"
         */

//		 Element <element> occurs <num> times

        String [] arr = {"a", "b", "c", "b", "a", "a", "d", "e", "e", "e", "e", "f", "p"};

        String elements="";
        int counter;


        for(int i=0;i<arr.length;i++){
            counter=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]) && !arr[j].equals("no value")){
                    counter++;
                    arr[j]="no value";

                }
                else
                {
                    continue;
                }


            }
            if(!arr[i].equals("no value")) {
                System.out.println("Element " + arr[i] + " occurs " + counter + " times");
            }
        }





    }
}
