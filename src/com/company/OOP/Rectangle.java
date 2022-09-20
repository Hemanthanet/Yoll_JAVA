package com.company.OOP;

public class Rectangle {

    /*
    Create a class that represents a Rectangle
    A rectangle has a double width and a double length
    Define some methods such as area (the area of a rectangle is length * width)
    Define a method the prints the information of the rectangle
     */

    double width;
    double length;

    double getArea(double width ,double length )
    {
        return Math.round(width*length);

    }

}
