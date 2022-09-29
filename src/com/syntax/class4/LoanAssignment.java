package com.syntax.class4;

import java.util.Scanner;

public class LoanAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("how much loan do you need");
		int loan= input.nextInt();
		if (loan<=200000) {
			System.out.println(" you eligible to receive the loan ");
		}else {
			System.out.println("your loan request is rejected");
		}
		

	}

}
