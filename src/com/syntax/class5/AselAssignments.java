package com.syntax.class5;

import java.util.Scanner;

public class AselAssignments {

	public static void main(String[] args) {
		// 
		/*
		 * Today at 10:39 AM
1. Prompt the user to enter person heights in inches. Person should be
 classified as one of the following: • short (under 60 inch) • medium(between 60 -72 inch)
  • tall (over 72 inch) 2. Write a program that will print whether it is a weekend or weekday.
   If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, 
   any other day → output “Invalid day” 3. Ask user to enter a number and then define if number is small,
    medium or large Small number is value between 1 and 10 Medium number is value between
     11 and 100 Large number is value between 101 and 1000

		 */
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter you height in inches ");
		int height = input.nextInt();
		if(height<60) {
			System.out.println("you are short");
		}else if(height>60&& height<72) {
			System.out.println("medium");
			
		}else {
			System.out.println("you are tall");
		}
		

	}

}
