package com.company.OOP;

public class DayOne_03_Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        double myRectangleWidth=23.8675;
        double myRectangleLength=45.8776;
        double area=rectangle.getArea(myRectangleWidth, myRectangleLength);
        System.out.println(area);

    }
}
