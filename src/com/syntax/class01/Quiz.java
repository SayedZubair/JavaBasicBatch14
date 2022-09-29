package com.syntax.class01;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. create a secret number and let user  guess the secret number 
		// once gussed you secret number __ program says u won 

	Scanner input = new Scanner(System.in);
	    int secret = 1234;
	    int guess;
	
	    do {
	        System.out.println("Please guess the secret number: ");
	        guess = input.nextInt();

  }while(guess != secret);
	
    System.out.println("You won!");
	
	}

}
