package com.cordboard.week08;

public class Factorial {
    public static void main(String[] args) {
        //	5! = 5 * 4 * 3 * 2 * 1
            // 5! = 5 * 4!
                // 4! = 4 * 3!
                    // 3! = 3 * 2!
                         // 2! = 2 * 1!
                            // 1! = 1 * 0!
                                 // 0! = 1
        System.out.println(calculateFactorial(5));

    }

    public static int calculateFactorial(int num) {

        if(num >= 1) {
           // System.out.println(num+"*"+(num-1)+"="+num*(num-1));
            return num * calculateFactorial(num - 1);

        }else {
            return 1;
        }


    }
}
