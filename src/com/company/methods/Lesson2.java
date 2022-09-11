package com.company.methods;

public class Lesson2 {
    public static void main(String[] args) {

        System.out.println(ContainIgnoreCase("Hemantha Jayasundara","Hemantha " ));

    }
    public static boolean ContainIgnoreCase(String text,String word)
    {
        String textModified=text.toLowerCase();
        String wordModified=word.toLowerCase();
        boolean result=textModified.contains(wordModified);
        return result;
    }
}
