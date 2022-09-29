package com.syntax.class6;

import java.util.Scanner;

public class ALLPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("please enter your country");
		String country = input.next();
		String currency="";
		
		switch(country) {
		case "USA":
			currency="doller";
			break;
		case "Turkey":
			currency="ler";
			break;
		case "Italy":
			currency="euro";
			break;
		case "Afghanistan":
		currency= "afghani";
		break;
		case "Iran":
			currency= "real";
		break;
		default:
			currency=("invalid");
		}
		System.out.println("the currency is "+currency);
		
		int num = 5;
		while (num>=1) {
			System.out.println(" I love my love");
			num--;
		}
	}

}
