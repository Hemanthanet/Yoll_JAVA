package com.group2.coding_day;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println( isPrime(9));
    }

    public static boolean isPrime(int num)
    {
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;

    }
}
