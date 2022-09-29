package com.syntax.class6;

import java.util.Scanner;

public class AllPractice2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("In");
		int num =input.nextInt();
		int counter=1;
		double save=0;
		while (counter<=num) {
			System.out.println((double)1/counter);
			save += (double)1/counter;
			counter++;
			
			
		}
		System.out.println(save);
	}

}
