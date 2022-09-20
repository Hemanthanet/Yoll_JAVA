package com.cordboard.other_weeks;

public class CustomArray4 {
    public static void main(String[] args) {

        /*
                 ## Multidimensional Arrays
                A multidimensional array is an array containing one or more arrays.
                To create a two-dimensional array, add each array within its own set of **curly braces.**
                Instructions:
                - Create multidimensional array of int, myNumbers, and assign two sets of numbers: (1,2,3,4) and (5,6,7)
                - First set consisting of 4 numbers and second set consisting of 3 numbers
                **- myNumbers** is now an array with two arrays as its elements.
                - Create another int variable to access the elements of the **myNumbers** array, specify two indexes: one for the array, and one for the element inside that array.
                - This variable should access the third element in the second array of myNumbers
                - Print the result
         */
        //your code here

        int myNumbers[][]={{1,2,3,4},{5,6,7}};
        int accessElement=myNumbers[1][2];
        System.out.println(accessElement);




    }
}
