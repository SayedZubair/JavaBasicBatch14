package com.syntax.class7;

public class Task5forArrays {

	public static void main(String[] args) {
		//5. Create an array to store char values and then print those in reverse order
		char letters[]= {'A','B','C','D','E'};
		// we use i=letters.lengh as we need to print out in reverse order.
		for(int i=letters.length-1; i>=0; i--) {//length-1 as we have 5 indexes, we get error, that y 
												// we need to subtract to 1..
			System.out.println(letters[i]);//// here is the majic....as the index starts with 0 we have to 
			//do length-1
		}
	}

}
