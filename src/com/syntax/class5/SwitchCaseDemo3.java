package com.syntax.class5;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we need to ask a use where he or she is from
		 * based on the country ->define favorite food
		 * 
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("please enter your are from");
		String country=input.nextLine();
		String favoriteFood="";
		switch (country) {
		case "USA":
			favoriteFood = "burgers and fries";
			break;
		case "Kazakistan":
	         favoriteFood="adana kebab";
	         break;
		case "venezuale":
			favoriteFood= "Arepa";
			break;
		case "india":
			favoriteFood= "curry";
			break;
		case"yemen":
			favoriteFood = "Mandi";
			break;
		case "Afghanistan":
			favoriteFood= "palow";
			break;
			default :
				favoriteFood= "unknown";
			
		}
		System.out.println("you are from "+country+" and your favorite food is "+favoriteFood);
	}

}
