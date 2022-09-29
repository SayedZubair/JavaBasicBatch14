package com.syntax.class5;

import java.util.Scanner;

public class LastReview6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("are u from batch 14");
		String batch14 = scanner.next();
		if (batch14.equalsIgnoreCase("yes")) {
			System.out.println("you are amazing ");
		
		}else {
			System.out.println("you are good ");
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
		// we rewrite with help of nested if in the next class last review 7
		// in switch we can use .equalsignorecase
		// we can use touppercase and tolowercase
	}

}
