package com.syntax.class6;

import java.util.Scanner;

public class DoWhileDemo2 {

	public static void main(String[] args) {
		/*
		 * repetive quuestion if we get a job
		 * when we dont know how many times the will make the question we use do 
		 * while loop has 95% usage
		 */
		Scanner sc = new Scanner(System.in);
		String answer;
		do {     //if want countiously capture the question 
		System.out.println("Did you get a job ");
		answer = sc.nextLine();
		
		} while (!answer.equals("yes"));
		System.out.println("congrats");
	}
	}
