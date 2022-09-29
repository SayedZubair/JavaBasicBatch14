package com.syntax.class6;

import java.util.Scanner;

public class AsgharIntervirwquestion {

	public static void main(String[] args) {
		System.out.println(" * ");
		System.out.println("* *");
		System.out.println("***");
		System.out.println("****");
		System.out.println("****** ");
	// do this with the help of loop
		
		// every loops can be changed with the other
		// then we have while loop and for loop the only reason is because sometime for each senarios they
		// can simplify 
	//	for (int i =0; true; i++ ) {
			
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter your number");
		int i= scanner.nextInt();
		while (i!=10) {
			System.out.println(i);
			i = scanner.nextInt();
		}
		//// for loop it can be written with for loop but its always better to use while when we dont know
		// the number of thr repeation
		for (int k= 0; i !=10; k++) {
			System.out.println(i);
			i= scanner.nextInt();
		}
		// all the loops are interchangeable  but sometimes using the one type of loop can make your code
		//cleaner and easier to understand
		for (int y= 0; i!=10; y=0) {
			System.out.println(i);
			i=scanner.nextInt();
		}
	}

}
