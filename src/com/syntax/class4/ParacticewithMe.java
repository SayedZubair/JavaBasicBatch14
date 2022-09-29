package com.syntax.class4;

import java.util.Scanner;

public class ParacticewithMe {

	public static void main(String[] args) {

	Scanner input= new Scanner(System.in);
	System.out.println("do you have a credit");
	boolean credit= input.nextBoolean();
	System.out.println("you can get a credit");

			if(credit) {
				System.out.println("what is the balance on your credit");
				int balance= input.nextInt();
				if (balance<1000) {
					System.out.println("pay off immidiatly");
				}
			}else {
				System.out.println("you can spend more");
				
				// why I get the response at any boolean condition
				//why else is not being activited 
				
			}
	
	}	
		} 
	
			
	
		
		
	


