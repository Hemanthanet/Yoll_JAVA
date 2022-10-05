package com.group2.coding_day;

public class Task2 {
    public static void main(String[] args) {
        /*
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(minValue(arr));
         */
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(findMinValue(arr));
    }

    public static int findMinValue(int []arr){
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
