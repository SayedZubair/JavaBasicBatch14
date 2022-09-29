package com.syntax10;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		String str ="I love java programming";
		
		// tocharArray will convert a String to an array of chars 
		
		char[] charArray=str.toCharArray();
		
		System.out.println(charArray[3]);
		
		System.out.println(Arrays.toString(charArray));
		
		
		
		int counter=0;
		int counterm=0;
		for(char c:charArray) {
			if (c=='a') {
				counter++;
				
			}
			if (c=='m')
				counterm++;
		}
		System.out.println("letter a has appeared "+counter+"times");
		System.out.println(counterm);
	}

}
