package com.syntax.class7;

public class Tasks {

	public static void main(String[] args) {
		// 1. Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		String[] cars =new String[6];
		cars[0]="Toyota";
		cars[1]="Mercedez";
		cars[2]="Honda";
		cars[3]="bmw";
		cars[4]="ford";
		cars[5]="Tesla";
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		
		}
		System.out.println("--------------------------------------------------");
		for (String motar:cars) {
			System.out.println(motar);
		}
	
	}

}
