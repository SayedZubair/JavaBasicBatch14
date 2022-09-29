package com.syntax.class7;

public class ForEachLoop {

	public static void main(String[] args) {
		//only when we deal with arrays or collections 
		//we can use for each loop,enhanced for loop advanced
		String[] iceCream= {"vanila","choclate","pistashio","kulfi","mango"};
		for(String flavor:iceCream) {
			System.out.println(flavor);
		}
		System.out.println("---------------------------------------------");
		char[]letters= {'A','B','C','D'};
		
		for(char letter:letters) {
			System.out.println(letter+" ");
		}
	System.out.println("----------------------------------------");
	
	int[] numbers= {12, 56, 345,1, 0, 0};
	//get all the elements using regular loop
	for (int i =0; i<numbers.length; i++) {
		System.out.println(numbers[i]+" ");
		
	}
	System.out.println();
	// get all the values using enhanced for loop // enhance loops starts always from the start till
	//end.. no reverse only one way
	for (int num:numbers) {
		System.out.println(num+" ");
		
	}
		}

}
