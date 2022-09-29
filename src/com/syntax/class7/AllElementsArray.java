package com.syntax.class7;

public class AllElementsArray {

	public static void main(String[] args) {
		String[] iceCream= {"vanila","choclate","pistashio","kulfi","mango"};
	//	System.out.println(iceCream[0]);
		//System.out.println(iceCream[1]);
	//	System.out.println(iceCream[2]);
		//how to get all the values/
		//.length will say the number of the arrays
		for(int i=0; i<iceCream.length; i++) {
			System.out.println(iceCream[i]);
		}
		System.out.println("--------------------------------");
		
		char[]letters= {'A','B','C','D','E'};
		for(int i =0; i<letters.length; i++){
		System.out.print(letters[i]+" ");
		
		}	
	}

}
