package com.cordboard.other_weeks;

import java.util.Scanner;

public class Alejandro_2 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String a = s.nextLine(); // email content


        String output="";
        if((a.contains("project") || a.contains(" PROJECT")|| a.contains("Project")) && (a.contains("Alejandro") || a.contains(" alejandro") || a.contains("ALEJANDRO") ))
        {
            output="read this mail";
        }
        else //(a.contains("Alejandro") || a.contains(" Alejandro") || a.contains("ALEJANDRO") )
        {
            output="don't read";
        }
        System.out.println(output);


    }
}
