package com.cordboard;

import java.util.Scanner;

public class Conditional_Statement_4_otherway {
    public static void main(String[] args) {
        /*
                             For you to do:
                                Given a string variable "word", do the following tests
                                If the word ends in "y", print "-ies" // family
                                If the word ends in "ey", print "-eys" // honey
                                If the word ends in "ife", print "-ives" //life
                                If none of the above is true, print "-s" //product
                                No more than one should be printed.
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        char word_array[]=word.toCharArray();


        String in_y="y";
        String in_ey="ey";
        String in_ife="ife";


        char last_y=word_array[word_array.length-1];
        String char_last_ey=word_array[word_array.length-2]+""+word_array[word_array.length-1];
        String char_last_ife=word_array[word_array.length-3]+""+word_array[word_array.length-2]+""+word_array[word_array.length-1];

//        System.out.println(last_y);
//        System.out.println(char_last_ey);
//        System.out.println(char_last_ife);
//
        if(word_array[word_array.length-2]=='e' &&  word_array[word_array.length-1] =='y')
        {
            System.out.println("-eys");
        }else if(word_array[word_array.length-1]=='y' || word_array[word_array.length-1]=='Y' )
        {

            System.out.println("-ies");
        }else if(word_array[word_array.length-3]=='i' &&  word_array[word_array.length-2]=='f' && word_array[word_array.length-1]=='e'){
            System.out.println("-ives");
        }
        else
        {
            System.out.println("-s");
        }




    }
}
