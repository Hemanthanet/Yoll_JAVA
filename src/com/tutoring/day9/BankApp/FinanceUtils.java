package com.tutoring.day9.BankApp;

import java.util.Scanner;

public class FinanceUtils {

	
	static Scanner in = new Scanner(System.in);
	
	public static void deposit(User user) {
		double amount = AppUtils.getInputAsDouble("Please enter the amount to deposit.");
		user.deposit(amount);
		AppUtils.mainMenu(user);
	}
	
	
		public static void withdraw(User user) {
			double amount = AppUtils.getInputAsDouble("Please enter the amount to withdraw.");
			user.withdraw(amount);
			AppUtils.mainMenu(user);
			}
			
			
		public static void send(User user) {
			User recipient = null;
			System.out.println("Please enter the username of the recipient");
			String recipientUsername = in.next();
			if(user.username.equals(recipientUsername)) {
				System.out.println("You can not send money to yourself.");
				AppUtils.mainMenu(user);
			}
			if(Database.usernameIsTaken(recipientUsername)) {
				for(User each: Database.users) {
					if (each.username.equals(recipientUsername)) {
						recipient = each;
						break;
					}
				}
				double amount = AppUtils.getInputAsDouble("Please enter the amount you want to send to "+recipient.firstName);
				user.sendMoney(recipient, amount);
				AppUtils.mainMenu(user);
			}
			else {
				System.out.println("There is no user with username \""+recipientUsername+"\"");
				AppUtils.mainMenu(user);
			}
		}
}
