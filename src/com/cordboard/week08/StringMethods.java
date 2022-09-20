package com.cordboard.week08;

import java.util.Scanner;

public class StringMethods {


    /*

                    Instructions from your teacher:

                You have a word, do the following:

                When word has odd number of characters and:

                    **- 3 or more characters,** print middle letter
                      oak ==> a
                      javav ==> v
                    - **Single character,** print that character 3 times
                      # ==> ###
                      q ==> qqq
                When word has even number of characters and:

                   - **4 or more characters**, print middle 2
                     java ==> av
                     apples ==> pl
                     #$%^&* ==> %^

                2 characters, print those 2 characters twice
                      @@ ==>@@@@
                      $$ ==>$$$$
                      hi ==> hihi
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //Write Your code here
        int word_length=word.length();
        String output="";
        if(word_length%2!=0)
        {

            if(word_length==1){
                output=word+word+word;
            }else if(word_length<=3){
                output=String.valueOf(word.charAt(1));

            }
            else
            {
                output=String.valueOf(word.charAt(word_length/2));

            }
        }else
        {
            if(word_length==2 )
            {
                output=word+word;
            }else{
                int beginIndex=(word_length/2)-1;
                int endingIndex=(word_length/2)+1;
                output=word.substring(beginIndex,endingIndex);
            }
        }
        System.out.println(output);

    }
}
