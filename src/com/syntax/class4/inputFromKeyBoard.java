package com.syntax.class4;

import java.util.Scanner;

public class inputFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * Scanner is a class that helps us take the input from the keyboard
	 * it contains many different smaller modules called methods that can
	 * help us take strings booleans basically all types of data from the
	 * keyboard 
	 */
		Scanner input = new Scanner(System.in);

		// a massage will be displayed to the user on the console to enter
		//his or her name
		
		System.out.println("please enter your name");
		// Activates the java program to take the input from the keyboard
		//and store inside the name variable
		String name = input.next();
		//print what ever name user enters on the keyboard on the console
       
		System.out.println("Hello " + name);
	}

}
