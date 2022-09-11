package com.cordboard;

import java.util.Scanner;

public class _N_ConditionalStatementPractice4_018 {
    public static void main(String[] args) {


        /*
                             For you to do:
                                Given a string variable "word", do the following tests
                                If the word ends in "y", print "-ies"
                                If the word ends in "ey", print "-eys"
                                If the word ends in "ife", print "-ives"
                                If none of the above is true, print "-s"
                                No more than one should be printed.
         */
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String in_y="y";
        String in_ey="ey";
        String in_ife="ife";




        //String removeFirst = str.substring(1, str.length() - 1);
        String y=word.substring(word.length()-1);
        String ey=word.substring(word.length()-2);
        String ife=word.substring(word.length()-3);




        if(in_ey.equalsIgnoreCase(ey))
        {
            System.out.println("-eys");
        }else if(in_y.equalsIgnoreCase(y)){
            System.out.println("-ies");
        }else if(in_ife.equalsIgnoreCase(ife))
        {
            System.out.println("-ives");
        }
        else
        {
            System.out.println("-s");
        }


        if(word.length()>=3){

            if(in_ey.equalsIgnoreCase(ey))
            {
                System.out.println("-eys");
            }

        }else if( word.length()>=1)
        {
            if(in_y.equalsIgnoreCase(y)){
                System.out.println("-ies");
            }

        }else if(word.length()>=4){
            if(in_ife.equalsIgnoreCase(ife))
            {
                System.out.println("-ives");
            }
        }else {
            System.out.println("-s");
        }




    }
}
