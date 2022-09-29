package com.syntax10;

public class Demo5 {

	public static void main(String[] args) {
	String str ="I love java programming";
	
	// charAt returns us the character at a specific index
	
	//System.out.println(str.charAt(3));
	for (int i=0; i<str.length(); i++) {
		if (str.charAt(i)!=' ') {//// this removes the spaces after each line 
			System.out.print(str.charAt(i));
		}
		
		
	}
	
	
}
}

