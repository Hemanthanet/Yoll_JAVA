package com.cordboard.week10;

import java.util.Arrays;
import java.util.Scanner;

public class For_IF_Substring_Find_Hello {
    public static void main(String[] args) {
        /*
        Instructions from your teacher:
        Print out the number of times that the string "hi" appears anywhere in the given string.
                    Example:
                    input: abc hi how hi
                    output: 2
                    Example:
                    input: hi code java please
                    output: 1
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // Your code here
        String find_word="hi";
        int count=0;
//        String str_arr[]=str.split(" ");
//        System.out.println(Arrays.toString(str_arr));
//        for (int i = 0; i < str_arr.length; i++) {
//                //count=str.indexOf("hi", )
//            if(str_arr[i].equals(find_word))
//            {
//                count++;
//            }
//
//        }
//        System.out.println(count);

        //option 2

//
//        String str = "This sentance contains find me string";
//        System.out.println(str);
//        // find word in String
//        String find = "find me";
//        int i = str.indexOf(find);
//        if(i>0)
//            System.out.println(str.substring(i, i+find.length()));
//        else
//            System.out.println("string not found");


    //---------

        for (int j = 0; j <str.length() ; j++) {
            if(str.contains(find_word)){
                if(str.substring(j,j+find_word.length()).equals(find_word)) //find_word.equals(str.substring(j, str.charAt(' ')))
                {
                    count++;
                }
               // String sub=str.substring(j, str.charAt(' '));
            }
            System.out.println(count);
        }





    }
}
