package com.company.methods;

public class Lesson01 {
    public static void main(String[] args) {
       running();
       jogging();
       jumping();
       activity("I'm running with parameter ");
       activity("I'm jumping with parameter ");
       activity("I'm jugging with parameter ");

    }

    public static void running() {
        System.out.println("I'm running ");
    }

    public static void jogging() {
        System.out.println("I'm jugging ");
    }

    public static void jumping() {
        System.out.println("I'm jumping ");
    }

    public static void activity(String act)
    {
        System.out.println(act);
    }
}
