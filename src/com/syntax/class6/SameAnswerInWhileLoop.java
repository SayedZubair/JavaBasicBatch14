package com.syntax.class6;

import java.util.Scanner;

public class SameAnswerInWhileLoop {

	
	// while vs do while = both loops executed while conditon is true 
	// while loop first check conditon - - if true then it executes 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		System.out.println("Did you get a job ");
		answer= sc.nextLine();
		while(!answer.equals("yes")) {
			System.out.println("did you get the job");
			answer = sc.nextLine();
		}
System.out.println("congrats");
	}

}
