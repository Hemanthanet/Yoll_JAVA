package com.tutoring.day8;

import java.text.DecimalFormat;

public class User {

    String firstName;
    String lastName;
    String country;
    double balance;
    public static final double INTERNATIONAL_TRANSFER_FEE = 4.5;


    /**
     * Displaying the current available balance after formating the balance
     */
    public void displayBalance() {
        balance = formatAs$(balance);  // formating the balance value in the beginning in case if available balance has invalid format from last transaction
        System.out.println("Hi "+firstName+". Your current available balance is $"+balance);
    }

    /**
     * Depositing any amount and there is no restriction on amount of deposit
     * @param depositAmount - amount of money to deposit
     */
    public void deposit(double depositAmount) {
        balance = formatAs$(balance);  // formating the balance value in the beginning in case if available balance has invalid format from last transaction
        balance+=depositAmount;
        System.out.println("Depositing $"+depositAmount+" to "+firstName+"'s account.");
        System.out.println("Hey "+firstName+". Your new available balance is $"+balance);
    }


    /**
     * Withdrawing money has restriction on available balance.User can not withdraw more than he/she has available.
     * @param withdrawAmount  - amount of money to withdraw
     */
    public void withdraw(double withdrawAmount) {
        withdrawAmount = formatAs$(withdrawAmount); // formating value in case if user passes some value like 0.5555555555
        balance = formatAs$(balance);    // formating the balance value in the beginning in case if available balance has invalid format from last transaction
        if(withdrawAmount> balance) {    // Checking if balance is less than requested amount to reject transaction
            System.out.println("Sorry "+firstName+". You have insufficient funds for this transaction.");
            System.out.println("Requested amount $"+withdrawAmount+" is not available since your current available balance is $"+balance);
        }
        else {
            balance-=withdrawAmount; //  Deducting withdraw amount from balance if withdraw amount is less than available balance
            System.out.println("Withdrawing $" + withdrawAmount+" from "+firstName+"'s account");
            System.out.println("Hey "+firstName+". Your new available balance is $"+balance);
        }
    }


    /**
     * Sending money has restriction on available balance. User can not send more than he/she has available.
     * If transaction is international balance should not be less than amount to send plus international transfer fee
     * @param recipient  - User object that we want to send money to
     * @param amount  -  amount of money user wants to send
     */

    public void sendMoney(User recipient, double amount) {
        balance = formatAs$(balance);  // formating the balance value in the beginning in case if available balance has invalid format from last transaction
        amount = formatAs$(amount);   // formating value in case if user passes some value like 0.5555555555
        boolean isInternationalTransfer = country.equals(recipient.country) ? false : true;   //  if country of user object equals to country of recipient user object is isInternationalTransfer will be false since they have the same country. Else: it will be true
        double amountWithFee = isInternationalTransfer ? formatAs$(amount*((100+INTERNATIONAL_TRANSFER_FEE)/100)) : amount;  // if isInternationalTransfer is true then amountWith fee will be amount plus fee. Else : fee will be 0 and amountWithFee will be equal to fee/
        double fee= formatAs$(amountWithFee - amount); // Calculating and formating the fee.
        if(isInternationalTransfer) {   // If tranfer is international printing fee for the transfer for the user with country info.
            System.out.println("Calculated international transfer fee is "+INTERNATIONAL_TRANSFER_FEE+"% of "+amount+" which is "+formatAs$((amount/100)*INTERNATIONAL_TRANSFER_FEE));
            System.out.println("International transfer fee from "+ country+" -> "+recipient.country+ " is $"+fee);
        }
        if(amountWithFee > balance) {  // if amount plus fee is more than users balance user should not be able to send the money.
            System.out.println("Sorry "+firstName+". You have insufficient funds for this transaction.");
            System.out.println("Required amount $"+amountWithFee+" is not available since your current available balance is $"+balance);
        }
        else {  // Else: he can send.
            balance-=amountWithFee;   // deducting amount to send plus fee from the user
            balance = formatAs$(balance);   // formating the balance right after in case we get some invalid value like 5.999999
            recipient.balance+=amount;    // adding amount without fees to recipient's account balance because fees are being charged by bank and recipient gets raw amount
            System.out.println("Sending $" + amount+" from "+firstName+" to "+recipient.firstName);
            System.out.println("Hey "+firstName+". Your new available balance is $"+balance);
        }

    }


    /**
     * Method to format given double value as USD currency.
     * @param amount  - double value to format as USD currency
     * @return - returns formatted double
     */
    public double formatAs$(double amount) {
        return Double.parseDouble(new DecimalFormat("#.##").format(amount));  // Using anonymous object of DecimalFormat class
//		and calling format method with that object right away passing our double value
//		Since format() method returns string we parse it to double right away and return formatted value as double already
//		Code above could be written without usage of anonymous object with declaration of reference variable as following as well:
//
//		DecimalFormat decimalFormat = 	new DecimalFormat("#.##");
//		String formattedStr = decimalFormat.format(amount);
//		double formattedAsDouble = Double.parseDouble(formattedStr);
//		return formattedAsDouble;
//
//		Since we don't need to use object of DecimalFormat anywhere else we don;t need to assign it to reference variable that will hold its reference (address),
//		so we can do it with anonymous object right away without reference variable.

    }




}
