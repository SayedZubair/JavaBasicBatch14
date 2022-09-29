package com.syntax10;

public class StringDemo {

	public static void main(String[] args) {
		
		// .length counts the number of characters in a string including the spaces
		
		String str=new String("Java ");  // proper way of creating an object
		//this also creating String but it has rare usage
		String name ="java clmkdskm dsvjdsvv";   /// this is most popular one, only works for String and wrapper classes
		System.out.println(str.length()); // for String we need()
		System.out.println(name.length());   
		
		// this part is the usually creating a password condition 
		
		if (name.length()>15) {
			System.out.println("name cant be more than 15 charecter");
		}
		
	}

}
