package com.cordboard.week08;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if(word.length()==5)
        {
            String [] word_arr=word.split("");
            for(int i=word_arr.length-1;i>=0;i--)
            {
                System.out.print(word_arr[i]);
            }
        }
        else if(word.length()>5)
        {
            System.out.println("Too long!");
        }
        else
        {
            System.out.println("Too short!");
        }
    }
}
