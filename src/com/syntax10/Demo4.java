package com.syntax10;

public class Demo4 {

	public static void main(String[] args) {
	
		String str="ShAh";
		String str2="shah";
		String str3=new String("shah");
		if (str.equals("shah")) {
			System.out.println("I found it ");
			
		}
		
		// equals checks if two Strings are exactly the same with exact same case 
		//equalsIgnorecase checks if two Strings are exactly the same but does not care about the case of 
		//letters
		if (str.equalsIgnoreCase("shah"))
			System.out.println("I found it with equalsIgnorcase");
	}

}
