package com.syntax.class6;

import java.util.Scanner;

public class SwitchCaseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// keep asking until you get the answer yes if you get married
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("did u get married");
		String answer =input.nextLine();
		while(!answer.equals("yes")) {
			System.out.println("did you get married");
			answer =input.nextLine();
		}
		System.out.println("congrats");
	}

}
