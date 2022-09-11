package com.company.methods;

public class Practice_01 {
    public static void main(String[] args) {

        /*

        Create a method called customCounter that gets an array of ints (int[]),
        it outputs how many negative , positive and zero numbers are in the array.
        customCounter (new int[]{6,3,-1,4,9,-4,0});		→ notice different way of passing array
        will output:
        positives:3, negatives:2, zeros:1
         */
        int testingArray[]={6,3,-1,4,9,-4,0};
        customCounter(testingArray);


    }

    public static void customCounter(int [] test)
    {
        int positive=0; int negative=0; int zero=0;
        for(int i=0;i<test.length;i++)
        {
            if(test[i]>0)
            {
                positive++;
            }else if(test[i]<0)
            {
                negative++;
            }else
            {
                zero++;
            }
        }
        System.out.println("zero =" + zero);
        System.out.println("positive =" + positive);
        System.out.println("Negative  =" + negative);
    }
}
