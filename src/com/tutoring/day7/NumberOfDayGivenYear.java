package com.tutoring.day7;

import java.util.Scanner;

public class NumberOfDayGivenYear {
    public static void main(String[] args) {

//		Write a method to find what is the number of day we are in a given year
//	    method that return int and takes params: int , string, int
//		First param int is number of day in a month
//		Second param string is name of the month
//		Third param int is a year
//		return int number of that day in a year

//		7 January 2022   - > 7      February 1 => 32
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day:");
        int day = in.nextInt();
        System.out.println("Enter month:");
        String month = in.next();
        System.out.println("Enter the year: ");
        int year = in.nextInt();
        int numberOfTheDayInAYear = numberOfTheDayInAYear(day, month, year);
        int daysFromChristmas = daysFromChristmas(year - 1) + numberOfTheDayInAYear;
        if (numberOfTheDayInAYear != -1) {
            System.out.println(day + " of " + month + " is " + numberOfTheDayInAYear + " day in " + year);
            System.out.println("And " + daysFromChristmas + " day from 01/01/0001.");

        }
    }


        public static int numberOfTheDayInAYear(int day, String month, int year) {
            int[] daysInMonths= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(isLeapYear(year)) {
                daysInMonths[1]=29;
            }
            int numberOfMonth = numberOfMonth(month);
            if(numberOfMonth == -1) return -1;
            int result=0;
            for(int i=0;i<numberOfMonth-1;i++) {
                result+=daysInMonths[i];
            }

            if(day<=0 || day>daysInMonths[numberOfMonth-1]) {
                System.out.println("Day value "+day+" is invalid for month "+month);
                return -1;
            }

            return result+=day;

        }

    //	Return number of month in a sequence
    public static int numberOfMonth(String month) {
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        for(int i=0;i<months.length;i++) {
            if(month.equalsIgnoreCase(months[i])) {
                return i+1;
            }
        }

        System.out.println("Invalid month: "+month);
        return -1;
    }








        public static boolean isLeapYear(int year) {
            if(year%400==0 ||( year%4==0 && year%100!=0)) {
                System.out.println(year+" is a leap year");
                return true;
            }
            return false;
        }


        public static int daysFromChristmas(int year) {
            int numOfLeapYears = year/4;
            int numberOfRegularYears = year- numOfLeapYears;
            return (numOfLeapYears*366)+(numberOfRegularYears*365);
        }


}

