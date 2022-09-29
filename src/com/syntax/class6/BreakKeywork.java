package com.syntax.class6;

public class BreakKeywork {

	public static void main(String[] args) {
	// in break loop for example out of many functionalities we wanna break on a certain function then it breaks
		// if we remove break it keeps on looping 
		boolean hungry=true;
		while(hungry) {
			
			System.out.println("give me food");
			break;
		}
	
        System.out.println("end");
	}

}
