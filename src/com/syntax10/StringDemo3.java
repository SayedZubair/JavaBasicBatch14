package com.syntax10;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="Olena";
		String lastName="dudka";
		System.out.println(firstName+lastName); //+ sign is most popular
		System.out.println(firstName.concat(" ").concat(lastName));
		
		
		String str=" ";
		
		// isEmpty() returns true if a string is empty this method will return false even if you have a space
		// in a string variable however the isBlank method does not count the spaces
		
		
		System.out.println(str.isEmpty());   
		
		//is blank prints out true even if there is a space in the string
		


	}

}
