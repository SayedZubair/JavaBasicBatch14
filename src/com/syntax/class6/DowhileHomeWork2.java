package com.syntax.class6;

import java.util.Scanner;

public class DowhileHomeWork2 {

	public static void main(String[] args) {
		//6. Declare a variable to store a price for a coffee. Ask the user to pay for a 
		//
//				coffee. Keep asking to pay for coffee until the user enters the EXACT amount
//				. If the user gives more than coffee price --> ask them to give less, 
//				if the user gives less money then ask to give more. Once user give EXACT amount print 
//				“Please enjoy your coffee
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("pay for coffee");
		int pay =input.nextInt();
		int price= 5;
		do {
			if (pay>price) {
				System.out.println("pay less");
				
			}else if (pay==price) {
				System.out.println("enjoy your coffe");
			}
			else {
				System.out.println("pay more");
				
			}
			pay =input.nextInt();
		}while(pay!=price);
		
		System.out.println("enjoy your coffe");
		

	}

}
