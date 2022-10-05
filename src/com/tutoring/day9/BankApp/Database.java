package com.tutoring.day9.BankApp;

import java.util.Arrays;

public class Database {

	public static User [] users = {};
 	
	
	public static void addNewUser(User newUser) {
		System.out.println("Creating new account for "+newUser.firstName);
		users = Arrays.copyOf(users, users.length+1);
		users[users.length -1] = newUser;
		System.out.println("Congrats "+newUser.firstName+ "! Your account was created successfully.");
		newUser.displayPersonalInfo();
	}
	
	public static boolean validateUsername(String enteredUsername) {
		for(User user :users) {
			if(user.username.equals(enteredUsername)) {
				AppUtils.currentUser = user;
				return true;
			}
		}
		return false;
	}
	
	public static boolean usernameIsTaken(String enteredUsername) {
		for(User user :users) {
			if(user.username.equals(enteredUsername)) {
				return true;
			}
	}
		return false;
	}
	
	
	
	
}
