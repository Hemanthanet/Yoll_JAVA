package com.group2.coding_day;

public class MyTaskOnline {
    public static void main(String[] args) {

    }

    public static int duplicates(int [] arr){

        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = i+1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }



        return count;



    }
}
