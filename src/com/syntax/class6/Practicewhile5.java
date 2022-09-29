package com.syntax.class6;

import java.util.Scanner;

public class Practicewhile5 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner input =new Scanner(System.in);
		String name="";
		
		
		for(int a =1; a<=3; a++) {
			System.out.println("what is your name");
			name= input .nextLine();
			
			
		}
		System.out.println("good afternoon "+name);
	}

}
