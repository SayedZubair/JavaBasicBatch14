package com.syntax10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecapFrom1to8 {

	public static void main(String[] args) {
	// string is the most widely used class in java. it helps us store and manipulate text based data.
		// why we should learn about string class and its method
	//	string class has lot of method that can help us manipulate the text based data.
		//that way we dont need to write any logic we can simple create the object of the string class and can 
		//use the method from that class
		//syntax
		String str =new String ("I cant sleep if i dont solve repls ");
		String str2="I cant sleep if i dont solve repls ";
		str.length();
		
		String str3="Today is sunday";
		String day=str3.substring(9);
		System.out.println(day);
		System.out.println(str3.substring(6,8));
		
		char c =str.charAt(4);// calling method charAt on str object
		//System.out.println(str3.charAt(6));
		System.out.println(c);
		
		
		// we want to print in reverse mood , first we have to convert to array of char
		
		String str4="Today is sunday";
		char[] charArr=str4.toCharArray();
		System.out.println(charArr); // here it prints only as string
		// if we want to print it as array
		System.out.println(Arrays.toString(charArr));
		
		int index=str4.indexOf("d");
				System.out.println(index);
				

	}

}
