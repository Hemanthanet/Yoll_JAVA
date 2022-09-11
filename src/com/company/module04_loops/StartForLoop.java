package com.company.module04_loops;

public class StartForLoop {
    public static void main(String[] args) {
        int sum=0;
        for( int i=1;i<=10;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Total " + sum);
        }

}
