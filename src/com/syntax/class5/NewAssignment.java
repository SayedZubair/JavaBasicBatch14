package com.syntax.class5;

import java.util.Scanner;

public class NewAssignment {

	public static void main(String[] args) {
		/*
		 * 1. Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered by a user with explanation.
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("enter your Grade please");
		char grade = input.next().charAt(0);
		String exp =null;
		switch(grade) {
		case 'A':
			exp="excellent";
			break;
		case 'B':
			exp="Good";
			break;
		case 'C':
			exp="Avarage";
			break;
		case 'D':
			exp="bad";
			break;
			default:
				exp = "Not Acceptable";
		}
		System.out.println(grade + "="+ exp);
	}

}
