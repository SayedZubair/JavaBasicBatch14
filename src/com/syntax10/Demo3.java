package com.syntax10;

public class Demo3 {

	public static void main(String[] args) {
		
		String str=" i love java ";
		System.out.println(str);
	
	
		//remove the spaces before and after the string but not the ones which are present in between	
	System.out.println(str.trim());
	
	String str2="Java is Very easy";
	System.out.println(str2.trim());
	//startswith checks if a string starts with a specific letter or word 
	//endswith checks if a string ends with a specific letter or word 
	System.out.println(str2.startsWith("J"));
	System.out.println(str2.endsWith("y"));
	System.out.println(str2.contains("Very"));  // if there is any letter or word in the meddle
	
	//method chaining helps us call multiple methods on a single line on method after another 
	System.out.println(str2.toLowerCase().contains("Very")); // it converts all the string to lowercase
	// then it compares 
}
}