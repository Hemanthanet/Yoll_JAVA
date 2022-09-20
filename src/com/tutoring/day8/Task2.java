package com.tutoring.day8;

public class Task2 {
    public static void main(String[] args) {

        User shabnam = new User();
        shabnam.firstName = "Shabnam";
        shabnam.lastName = "Gurbanzade";
        shabnam.balance = 0;
        shabnam.country = "US";

        shabnam.deposit(100);
        shabnam.displayBalance();

        User kamran = new User();
        kamran.firstName = "Kamran";
        kamran.lastName = "Alakbarov";
        kamran.balance = 0;
        kamran.country = "AZ";

        kamran.displayBalance();
        kamran.withdraw(10);
        kamran.displayBalance();
        kamran.deposit(1000000);
        kamran.displayBalance();
        kamran.withdraw(20);
        kamran.displayBalance();

        User fanika = new User();
        fanika.firstName = "Fanika";
        fanika.lastName = "Kh";
        fanika.country = "US";
        shabnam.sendMoney(fanika, 10);
        shabnam.displayBalance();
        fanika.displayBalance();
        fanika.sendMoney(kamran, 9);
        fanika.displayBalance();
        kamran.displayBalance();



        User nastia = new User();
        nastia.firstName = "Nastia";
        nastia.lastName = "Sin";
        nastia.country = "CA";
        nastia.deposit(100);
        nastia.sendMoney(fanika, 95);
        fanika.displayBalance();
        nastia.displayBalance();



    }
}
