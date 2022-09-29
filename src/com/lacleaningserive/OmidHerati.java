package com.lacleaningserive;

import java.util.Scanner;

public class OmidHerati {

	public static void main(String[] args) {
		//Write a Java program to get a number from the user and print whether it is positive or negative.

		

Scanner input=new Scanner(System.in);		
System.out.println("type your number");
int number =input.nextInt();
	if(number>=1) { 
		System.out.println("number is positive");
		
	}else {
		System.out.println("number is negitive");
	}
}
}