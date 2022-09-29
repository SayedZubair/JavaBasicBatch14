package com.syntax.class5;

import java.util.Scanner;

public class AselNewHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =”Spring” if user is born in June, July, August → season =”Summer” etc …
		 * 
		 */
	Scanner input = new Scanner(System.in);
	System.out.println("enter your birth month");
	String nameOfMonth = input.next();
	if (nameOfMonth.equals("March") || nameOfMonth.equals("April") || nameOfMonth.equals("May")) {
		System.out.println("spring");
	} else if (nameOfMonth.equals("June") || nameOfMonth.equals("July") || nameOfMonth.equals("august")) {
		System.out.println("Summer");

} else if (nameOfMonth.equals("September") || nameOfMonth.equals("October") || nameOfMonth.equals("November")) {
		System.out.println("Falls");
} else if (nameOfMonth.equals("December") || nameOfMonth.equals("January") || nameOfMonth.equals("Feburary")) {
			System.out.println("Winter");
		}
		

	}
}
