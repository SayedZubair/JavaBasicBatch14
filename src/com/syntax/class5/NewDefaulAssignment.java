package com.syntax.class5;

import java.util.Scanner;

public class NewDefaulAssignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the name of the month");
		String nameOfMonth = input.next();
		String season = "";
		if (nameOfMonth.equals("March") || nameOfMonth.equals("April") || nameOfMonth.equals("May")) {
			season = ("spring");

		} else if (nameOfMonth.equals("June") || nameOfMonth.equals("July") || nameOfMonth.equals("august")) {
			season = "Summer";

		} else if (nameOfMonth.equals("September") || nameOfMonth.equals("October") || nameOfMonth.equals("November")) {
			season = "Falls";
		} else if (nameOfMonth.equals("December") || nameOfMonth.equals("January") || nameOfMonth.equals("Feburary")) {
			season = "Winter";
		} else {
			System.out.println("invalid");
			
		}
		System.out.println("you are born in " + (season));

	}

}
