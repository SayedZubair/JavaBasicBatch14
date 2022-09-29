package com.syntax10;

public class Task2 {

	public static void main(String[] args) {
//		Create a String and if the String is not empty perform the following: 
//			if the String has an odd number of characters and has 3 or more characters, 
//			print the character in the middle of the String.

		
		String myLove="I love you java";
		if (!myLove.isEmpty()) {
			
			if(myLove.length()%2!=0 && myLove.length()>=3) {
				System.out.println(myLove.charAt(myLove.length()/2) );
				
			}
		}
	}

}
