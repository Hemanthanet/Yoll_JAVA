package com.cordboard;

import java.util.Scanner;

public class Email_2 {
    public static void main(String[] args) {

        /*
        Instructions from your teacher:

            Write a program that will print out information
            (First name, Last name, Domain, Top-Level Domain) about user based on email.
            first and last name should start with the upper case like in example.
            **Example:**
            **Input: craig_federighi@apple.com**
            **Output:**
            **First name: Craig**
            **Last name: Federighi**
            **Domain: apple**
            **Top-Level Domain: com**
         */

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //for first name
        String firstName=email.substring(0, email.lastIndexOf("_"));
        String FormattedFirstName=firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
        //for last name
        String lastName=email.substring(email.lastIndexOf("_")+1, email.lastIndexOf("@"));
        String formattedLastName=lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();
        //for domain and top level domain
        String domain=email.substring(email.indexOf("@")+1, email.indexOf("."));
        String topLevelDomain=email.substring(email.lastIndexOf(".")+1);

        //output
        System.out.println("First Name  :" +FormattedFirstName);
        System.out.println("Last Name  :"+ formattedLastName);
        System.out.println("Domain :"+ domain);
        System.out.println("Top Level Domain :"+ topLevelDomain);

    }
}
