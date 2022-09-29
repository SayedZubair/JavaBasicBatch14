package com.syntax10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	
//		store username, password and confirm password from a user and check following requirements:
//
//			Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//			Password should be minimum 8 characters, if less → message=”Password is too short”.
//			Password cannot contain username if so, → message=”Password cannot contain username”.
//			Password should match confirmed password, if not  → message=“Passwords do not match”.
//
//			Only after all requirements met → message “Your username and password has been created”
		
		
		
		
		
		
	String userName="user1";
	String password="pass123";
	String confirmPassword="pass123";
	if (userName.isEmpty()&& password.isEmpty()) {
		System.out.println("Username and Password cannot be empty");
	}else if(password.length()<8){
		System.out.println("password is too short");
		
	}else if (password.contains("userName")) {
		System.out.println("password can not contain user name");
	}else if (!password.equals(confirmPassword)) {
		System.out.println("passwords do not match");
	}else {
		System.out.println("your user name password has been created");
	}
		
		
	}

}
