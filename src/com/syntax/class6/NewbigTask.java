package com.syntax.class6;

import java.util.Scanner;

public class NewbigTask {

	public static void main(String[] args) {
//		Task 2: Write a program to ask a user to enter item they want to buy and the price of that item.
//		Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
//		If user give more money program should return a change.
//		Whenever user done with payments program should say "Thank you for shopping!"

		
	Scanner input=new Scanner(System.in);
	System.out.println("what do you want to buy");
	String item=input.nextLine();

	System.out.println("what the price of the item?");
	double money;
	double total =0;
	int price = input.nextInt();
	do {
		System.out.println("how much money do u have ");
		money=input.nextDouble();
		total+=money;//accumulate all money
		double need;
		double change;
		if(total<price) {
			need =price-total;
			System.out.println("you need to pay more"+need);
		}else if(total>price) {
			change=total-price;
			System.out.println("here is your change"+ change );
			break;
		}
	}while(total!=price);
	System.out.println("thank you for shoping ");
	
	}

}
