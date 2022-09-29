package com.syntax.class6;

public class NestedLoops2 {

	public static void main(String[] args) {
	// nested loops are used in real life specially excell files for the colomn and rows
		//outer will be represented by rows inner loops will be used for colomns 
		
		//takes the example of the car odometer
		for(int a=0; a<=9; a++) {
			for (int b=0; b<=9; b++) {
				for (int c = 0; c<=9; c++) {
					System.out.println(a+" "+b+" "+c);
				}
			}
		}

		//multiplication table
		for (int i = 1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println("------------------------");
		}
		
		
		
	}

}
