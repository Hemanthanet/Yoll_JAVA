package com.cordboard;

import javax.sound.midi.Soundbank;

public class CustomArray_06 {

    public static void main(String[] args) {

       /*

        You can declare an array of arrays (also known as a _multidimensional_ array) by using two or more sets of brackets, such as `String[][] names`.
        Each element, therefore, must be accessed by a corresponding number of index values.
        In the Java programming language, a multidimensional array is an array whose components are themselves arrays.

                Instructions:
                - Create multidimensional String array and name it names
                - First set: Mr. Mrs. Ms.
                - Second set: Smith Jones
                - Print first of first set and first of second set
                - Print third of first set and second of second set

        */

        String names[][];
        names= new String[][]{{"Mr.", "Mrs.", "Ms."}, {"Smith", "Jones"}};

        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);



    }
}
