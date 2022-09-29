package com.syntax.class5;

public class LastReview2 {

	public static void main(String[] args) {
		// logical or|| operator 
		// if one conddtion is true then we can print it ...
		
		
		boolean iceCream= true;
		boolean fruit = true;
		boolean tacoTruck = false;
		
		if (iceCream||fruit||tacoTruck) {
			System.out.println(" I am good for midnight snack");
		}
		else {
			System.out.println("i should buy something for midnight");
			
		}
		
		//// another example
		
		double saving = 200000;
		boolean freeTime = true;
		String season="summer";
		if(saving> 100000&& freeTime&&season.equals("summer")) {
			System.out.println("lets go to bora bora");
	
		
	}else {
	System.out.println(" I need some time ");
	}
	}
}
