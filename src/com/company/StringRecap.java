package com.company;

import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class StringRecap {
    public static void main(String[] args) {
        String sampleString="hEmantha_jayasundara_@";

        //charAt

        //equalsIgnoreCase

        //startsWith() -- > true /false

        //length  -- > int

        //endsWith()  -- > true/false

        //subString() -- > parameters index1- start Character and index2 end character
        System.out.println(sampleString.substring(0, 8));

        //concat


        //indexOf  ---> return int 
        System.out.println(sampleString.indexOf("@"));
        System.out.println(sampleString.indexOf("a"));
        System.out.println(sampleString.indexOf("_j"));


        int indexAtUnderscope = sampleString.indexOf("_");
        System.out.println(sampleString.substring(0, indexAtUnderscope));

        String email="hemantha_jayasundara@gmail.com";
        String fname="";
        String lname="";
        fname=email.substring(0, email.indexOf("_"));
        lname=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println(fname +" and " + lname);


        //  Offset  in index  of method
        String codeboard= " Codeboard are fun to slove ls;k afadfk;ljkj lkjsf";
        System.out.println(codeboard.indexOf("a",10));

        String sentence1="Hello asdfad  Hello !";
        System.out.println(sentence1.indexOf("Hello"));
        System.out.println(sentence1.lastIndexOf("Hello"));

        String specialWord= "Good jakdjf [Hemantha] jakdfjalk";
        int startIndex=specialWord.indexOf("["+1);
        int lastIndex=specialWord.lastIndexOf("]");
        System.out.println(startIndex +" "+ lastIndex);
        //System.out.println(specialWord.substring(startIndex,lastIndex));


        //Concat
        // option one  is " + "
        // option two is  Str1.concat("").concat(laname).concat("")

        //replace 

        String pattern="x_x_x_X";
        String new_pattern=pattern.replace("x","o");
        System.out.println(new_pattern);

        //replaceAll

        String string_pattern="___1___2___3___4___5";
        //here you have to use replace("1","dim"); ("2","dim");("3","dim")

        //therefore we have to use regex
       // "\\d"   any digit 
       //  \\s    any space
        //  [a-z]   all small letters
        //  [A-Z]   all capital letter

        System.out.println(string_pattern.replaceAll("\\d", "num"));


         // contains    -->true /false
        String my_sentence=" I like programming ";
        System.out.println(my_sentence.contains("I"));
        String my_email_message="you have a spam inbox email   message form abc .Would you like to open it? ";

        if(my_email_message.contains("inbox")){
            System.out.println("open email");
        } else if(my_email_message.contains("spam"))
        {
            System.out.println("Delete it ");
        } else
        {
            System.out.println("Save it ");
        }
        
        //toUpperCase()
        String myLower="kaldakjkadafjlk";
        System.out.println(myLower.toUpperCase());
        System.out.println(myLower.toLowerCase());

        //isEmpty()   and isBlank()

        String emptyText=" ";
        System.out.println(emptyText.isEmpty() );
        System.out.println(emptyText.isBlank());

        //trim() will truncate white spaces  starting and end  then remove that spaces

       String trimSemtence= "     I love java    ";
        System.out.println(trimSemtence.trim());
        




    }
}
