package com.company.OOP.module6;

public class Employee {

    /*
    Create Employees class:
    Variables: employeeID, name, salary, status
    Method: display() → should print all the above object variables.
    Create default and parameterized constructors
    When invoke default constr print - "New Employee Created"
    Name the parameters same as instance variable names
    Call the default constructor from the parameterized one
    Instantiate an object from the class
     */

    public int  employeeID;
    public String name;
    public double salary;
    public boolean status;

    public void  display()
    {
        System.out.println(employeeID);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(status);
    }

    public Employee(int employeeID, String name, double salary, boolean status) {
        this();
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.status = status;
    }

    public Employee() {

        System.out.println("New Employee Created");

    }

    public static void main(String[] args) {
        Employee emp1=new Employee(100,"hemantha",10000.00,true); // here as we have used this() run the default
        //constructor statements also printed


    }
}
