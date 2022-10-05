package com.cordboard.week10;

public class ForLoopContJava {
    public static void main(String[] args) {


//        for (int i = 0; i <str.length() ; i++) {
//
//
//            if (lastIndex != -1){
//                lastIndex = str.indexOf(findStr, lastIndex);
//                lastIndex += findStr.length();
//                count++;
//
//            }


//            if (str.length()>-1) {
//                count++;
//
//            }


        //option 2
//        String str="javaabcjavaabcjava";
//        String findStr = "java";
//        int lastIndex = 0;
//        int count = 0;

//        while (lastIndex != -1) {
//
//            lastIndex = str.indexOf(findStr, lastIndex);
//
//            if (lastIndex != -1) {
//                count++;
//                lastIndex += findStr.length();
//            }
//        }
//        System.out.println(count);

//        for (int lastIndex1 = 0; lastIndex1 > -1 ; lastIndex1+=findStr.length()) {
//            lastIndex=str.indexOf(findStr,lastIndex);
//            count++;
//        }
//
//        System.out.println(count);


        //option3

//        String str1 = "javax java java";
//        System.out.println(str1);
//        // find word in String
//        String find = "java";
//        int count = 0;
//
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.startsWith(find, i)) {
//                count++;
//            }
//        }
//        System.out.println("Java count is "+count);


        String str1 = "javaxjavajava";
        System.out.println(str1);
        // find word in String
        String find = "java";
        int count = 0;

        for (int i = 0; i <=str1.length()-4 ; i++) {
            if(str1.substring(i, i+4).equals("java"))
            {
                count++;

            }

        }
        System.out.println( "Count is " +count);







    }

}











