package com.company.OOP.Bank;

import java.util.Scanner;

public class DemoBank {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        WellsFargoBankAccount miamiBranch=new WellsFargoBankAccount();

//
//        /* Open an account */
//        miamiBranch.openAccount("Omar Ramo", 78677789, 2000, "Checking");
//
//        /* Add a deposit */
//        System.out.println("Deposition process..");
//        System.out.println("Enter deposit amount:");
//        miamiBranch.deposit(input.nextInt());
//
//        /* Make a withdraw */
//        System.out.println("Withdrawal process..");
//        miamiBranch.withdraw(2000);


        System.out.println("Welcome to " + WellsFargoBankAccount.BANK_NAME);
        System.out.println("Choose the option you want to perform:");
        System.out.println("1. Display Account.");
        System.out.println("2. Make a deposit.");
        System.out.println("3. Withdraw.");
        System.out.println("4. Display balance.");
        System.out.println("5. Open account");

        int userAnswer = input.nextInt();

        switch (userAnswer) {
            case 1:
                miamiBranch.displayAccount();
                break;
            case 2:
                System.out.println("How much you want to deposit:");
                miamiBranch.deposit(input.nextDouble());
                break;
            case 3:
                System.out.println("How much you want to withdraw:");
                miamiBranch.withdraw(input.nextDouble());
                break;
            case 4:
                miamiBranch.displayAccount();
                break;
            case 5:
                System.out.println("Enter: Full Name, Account Number, Deposit, Account Type");
                miamiBranch.openAccount(input.next(), input.nextInt(), input.nextDouble(), input.next());
                break;

            default:
                System.out.println("There is no such option");

        }

    }
}
