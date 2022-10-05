package com.GoogleClassRoom;

import java.util.Scanner;

public class BankAccount {

    /*
     //This part we have completed in class:
    Create a BankAccount Class
    Create below variables:
    bankName → static
    accountType
            accountNumber
    accountHolder
            Balance
     */
    final static String BANK_NAME = "ABC";
    public  static String accountType;
    public static int accountNumber;
    public  static String accountHolder;
    public  static double balance;
    public static Scanner scanner=new Scanner(System.in);

    public BankAccount(String bank_name) {
        //BANK_NAME = bank_name;
    }

    public BankAccount(String bank_name, String accountType, int accountNumber, String accountHolder, double balance) {
        //BANK_NAME = bank_name;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }







    // methods

    /*
    Create below methods:
        displayBalance
        Withdraw
        Deposit
        openAccount(with all the parameters)
        showBankPolicy -> static
     */

    public static void main(String[] args) {
        BankAccount.openAccount();
        BankAccount.displayBalance();
        BankAccount.spend();
        BankAccount.displayBalance();


    }


    public static double displayBalance(){
        System.out.println("=======Account Balance=======");
        System.out.println("Account balance is "+balance);
        return balance;
    }

    public static  void withdraw()
    {
        System.out.println("=======Account withdraw=======");

        System.out.println("Enter withdraw amount :");
        double withdrawAmount=scanner.nextDouble();
        if(balance<withdrawAmount)
        {
            System.out.println("Sorry account balance is not sufficient");
            System.out.println("Your current balance"+ displayBalance());
        }else{
            balance-=withdrawAmount;
            System.out.println("Your balance is before spend "+ displayBalance());
        }

    }
    public static void  deposit()
    {
        System.out.println("=======Account Deposit=======");

        System.out.println("Enter deposit  amount :");
        double depositAmount=scanner.nextDouble();
        balance+=depositAmount;
        System.out.println("Your new balance is "+displayBalance());

    }
    public static BankAccount openAccount()
    {

        System.out.println("=======New Account Create=======");

        System.out.println("Enter account Type");
        String accountType=scanner.next();
        System.out.println("Enter account Number");
        int accountNumber=scanner.nextInt();
        System.out.println("Enter account Holder");
        String accountHolder=scanner.next();
        System.out.println("Enter account initial deposit ");
        double balance=scanner.nextDouble();

       BankAccount bankAccount= new BankAccount(BANK_NAME, accountType,accountNumber,accountHolder,balance);
        System.out.println("Account has been created !");
        System.out.println("=======Account details====== ");
        System.out.println("Bank name : "+BANK_NAME);
        System.out.println("Account Type :"+bankAccount.accountType);
        System.out.println("Account Number"+bankAccount.accountNumber);
        System.out.println("Account Holder "+bankAccount.accountHolder);
        System.out.println("Account Balance"+bankAccount.balance);
        System.out.println(bankAccount);
        return bankAccount;
    }

    public static void showBankPolicy(){
        System.out.println("========BANK POLICY==========");
        System.out.println(" help get the conversation and the procedure started on the right foot.");
    }

    /*
    Create a method called spend
        It should decrease the amount you spent from balance
        It should not let you spend more than what you have in balance
        If account type is checking, it should add %5 back to the balance as a reward
        It should return new balance (not print)
        Print new balance from main method
     */

    public static double spend(){
        System.out.println("What is you spend Amount ?");
        double spendAmount=scanner.nextDouble();
        System.out.println("=======Spends=======");
        double reward=0.05;
        displayBalance();//show current balance
        if(balance>=spendAmount){
            if(accountType.equals("Checking"))
            {
                double rewardAmount=spendAmount*reward;
                spendAmount-=rewardAmount;
                balance-=spendAmount;
            }else {
                balance-=spendAmount;
            }
            System.out.println("Spend amount is "+spendAmount);
            System.out.println(displayBalance());
        }else
        {
            System.out.println("sorry Account balance is not sufficient to spend");
        }

        return balance;

    }


}
