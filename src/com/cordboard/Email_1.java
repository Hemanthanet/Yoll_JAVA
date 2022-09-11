package com.cordboard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_1 {

    private static final String EMAIL_PATTERN = "^(.+)@(\\S+)$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    public static boolean isValid(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        /*
        Instructions from your teacher:
                In this task, you need to swap first name with last name in the email.
                 If email doesn't contain underscore - don't change anything
                Example:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
                Example:
                input: barakobama@gmail.com
                output: barakobama@gmail.com
         */


        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String output="";
        if(email.contains("_"))
        {
           String lastName=email.substring(0, email.lastIndexOf('_'));
         String firstName=email.substring(email.lastIndexOf("_")+1, email.lastIndexOf("@"));
           String emailRest=email.substring(email.lastIndexOf("@"));
           output=firstName+"_"+lastName+emailRest;
        }else
        {
           output=email;
        }
        System.out.println(output);
    }




}
