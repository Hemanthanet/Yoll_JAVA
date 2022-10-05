package com.tutoring.day9.BankApp;

import java.util.Scanner;

public class AppUtils {

	  static Scanner in = new Scanner(System.in);
      static User currentUser;
	
	
	public static void startApp() {
		System.out.println("Welcome!");
		do {
			System.out.println("Are you a registered user?");
			String answer = in.next();
		if (answer.equalsIgnoreCase("yes")) {
			signIn();
			break;
		}
		else if (answer.equalsIgnoreCase("no")) {
			offerToSignUp();
			break;
		}
		else {
			System.out.println("Invalid input. Please enter \"yes\" or \"no\".");
		}
		} while(true);
	}
	
	
      public static void offerToSignUp() {
    	  do {
        	  System.out.println("Would you like to sign up?");
  			String answer = in.next();
  		if (answer.equalsIgnoreCase("yes")) {
  			signUp();
  			break;
  		}
  		else if (answer.equalsIgnoreCase("no")) {
  			System.out.println("Sorry :( In order to proceed you have to sign up.");
  			offerToSignUp();
  			break;
  		}
  		else {
  			System.out.println("Invalid input. Please enter \"yes\" or \"no\".");
  		}
  		} while(true);
	    }
	
	
	
	public static void signIn() {
		String enteredUsername = "";
		String enteredPassword = "";
		System.out.println("Please enter your username:");
		do{
			enteredUsername = in.next();
		if(Database.validateUsername(enteredUsername)) {
			System.out.println("Please enter your password:");
			int tries = 3;
			do {
				enteredPassword = in.next();
				if(currentUser.password.equals(enteredPassword)) {
					mainMenu(currentUser);
					break;
				}
				else {
					tries--;
					if(tries == 0) {
						int secondsBlocked = 10;
						System.out.println("Your account is temporarily blocked for 10 seconds");
						
						for(int i=secondsBlocked ; i>0 ; i--) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {

							}
							System.out.print(i + " ");
						}
						
						System.out.println("\n");
						signIn();
						break;
					}
					System.out.println("Incorrect password. You have "+tries+" tries left. Please try again.");
				}
			} while(true);
			
		}
		else {
			System.out.println("Invalid username. Please try again.");
			signIn();
			break;
		}
		} while (true);
	}
	
	
    public static void signUp() {
		User newUser = new User();
		System.out.println("Proceeding with sign up.\nPlease enter your firstname:");
		newUser.firstName = in.nextLine() +in.next();
		System.out.println("Please enter your lastname:");
		newUser.lastName = in.nextLine() +in.next();
		System.out.println("Please enter your country of residence: ");
		newUser.country = in.next();
		System.out.println("Please set your username:");
		do {
		newUser.username = in.next();
		if(Database.usernameIsTaken(newUser.username)) {
			System.out.println("Sorry. Username \""+newUser.username+"\" is taken.\nPlease set some other username.");
		}
		} while (Database.usernameIsTaken(newUser.username));
		
		System.out.println("Please set your password:");
		newUser.password = in.next();
		newUser.balance = getInputAsDouble("Please enter your balance:");
        Database.addNewUser(newUser);
        System.out.println("Please proceed with sign in.");
        signIn();
	}
	
    
    
    public static void mainMenu(User user) {
    	System.out.println("Welcome back, "+user.firstName);
    	System.out.println("Please press \"i\" to see your Personal Info");
    	System.out.println("Please press \"d\" to see your deposit money");
    	System.out.println("Please press \"w\" to see your withdraw money");
    	System.out.println("Please press \"s\" to see your send money");
		System.out.println("Please press \"q\" to sign out");
    	do {
			String answer = in.next();
		if (answer.equalsIgnoreCase("i")) {
			user.displayPersonalInfo();
			mainMenu(user);
			break;
		}
		else if (answer.equalsIgnoreCase("d")) {
			FinanceUtils.deposit(user);
			break;
		}
		else if (answer.equalsIgnoreCase("w")) {
			FinanceUtils.withdraw(user);
			break;
		}
		else if (answer.equalsIgnoreCase("s")) {
			FinanceUtils.send(user);
			break;
		}
		else if (answer.equalsIgnoreCase("q")) {
			System.out.println("Signing out from "+user.firstName+"'s account.");
			currentUser = null;
			startApp();
			break;
		}
		else {
			System.out.println("Invalid input. Please enter \"i\", \"d\",\"w\", \"s\" or \"q\".");
		}
		} while(true);    	
    	
    }
    
    
    public static double getInputAsDouble(String message) {
    	do {
    		System.out.println(message);
    		String enteredNum = in.next();
    		if(isDouble(enteredNum)) {
    			return Double.parseDouble(enteredNum);
    		}
    		System.out.println("Invalid input. Please try again.");
    	} while (true);
    }
    
    
    
    
    public static boolean isDouble(String num) {
    	boolean flag = true;
    	int counter = 0;
		for(char each : num.toCharArray()) {
			if(!Character.isDigit(each)) {
				flag = false;
				counter++;
				if(counter == 2 && flag ==false) {
					return false;
				}
			}
		}
		if(counter == 1) {
			if(num.contains(".") ) {
				return true;
			}
			else {
				return false;
			}
		}
		return flag;
	}
}
