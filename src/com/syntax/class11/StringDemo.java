package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
	String str="dfudUHHJKNUH2312198@&*(#@$%";
	System.out.println(str.replaceAll("[0-9]","@"));
	// remove all numbers from 0-9
	System.out.println(str.replaceAll("[0-5]",""));
//	remove all letters from a to z refer the asci table for range info
	System.out.println(str.replaceAll("[a-z]",""));
	System.out.println(str.replaceAll("[a-g]",""));
	System.out.println(str.replaceAll("[A-Z]",""));
	System.out.println(str.replaceAll("[^A-Z]",""));//^ means not
	System.out.println(str.replaceAll("[^a-zA-Z]",""));
	System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
	
	//regular expression
	
	}

}
