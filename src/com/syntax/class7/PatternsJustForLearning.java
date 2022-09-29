package com.syntax.class7;

public class PatternsJustForLearning {

	public static void main(String[] args) {
		// in pattern its important to know how manyrows and colomns we have;
		
		// for triangles always colomns are equal to rows
		// in square we print the 1st and the last rows and coloms for the middle colomns and rows we need to 
		// have if cocndition;
		
		
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=3; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("-----------------------------------");

	for(int i=1; i<=4; i++) {
	for (int j=1; j<=3; j++) {
		System.out.print(i+" ");
	}
	System.out.println();
}
	System.out.println("------------------------------");
	for(int i=1; i<=5; i++) {
		for (int j=1; j<=5; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}

}
