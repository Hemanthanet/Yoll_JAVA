package com.company.OOP.Bank;

public class WellsFargoBankAccount {
    /*
                Create a BankAccount Class
            Create below variables:
            bankName → static
            accountType
            accountNumber
            accountHolder
            Balance
            Create below methods:
            displayBalance
            Withdraw
            Deposit
            openAccount(with all the parameters)
            showBankPolicy -> static
     */

        //state of the bank object
    public static final String BANK_NAME="Wells Fargo";
    public String accountType;
    public int accountnumber;
    public String acccountHolder;
    public double balance;


    /* behavior described by method */

    //display balance with specific format
    public void displayAccount()
    {
        System.out.format("$ %,.3f", balance);
    }

    //withdraw

    public void withdraw(double withdraw_amount)
    {
        if(balance>=withdraw_amount){
            balance-=withdraw_amount;
        }else
        {
            System.out.println("Sorry your account balance is not sufficient for withdraw to this amount");
        }
        displayAccount();
    }

    public void deposit(double deposit_amount)
    {
        balance+=deposit_amount;
        System.out.println("Success ! The amount has increased ");
        displayAccount();

    }

    //open account
    public void openAccount( String acccountHolder,int accountnumber,double balance,String accountType)
    {
        accountType=accountType;
        accountnumber=accountnumber;
        acccountHolder=acccountHolder;
        balance=balance;
        System.out.println("Account has created !");
    }

}
