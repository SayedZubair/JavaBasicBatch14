package com.syntax.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// logical not reverse the condition , we wanna reverse the true to false and vise versa
		
		boolean boo=!true;//false
		System.out.println(boo);
		boolean boo1 = !false;///true
		System.out.println(boo1);
		
		boolean rain = true;///// we cant enter the if block because condition is true
		if(!rain) {
			System.out.println("I will go for a walk");
		}
		String day ="Sunday";
		if(!day.equals("Sunday")) {////it does not enter the if block because the boolean is sunday
			System.out.println("today is not sunday");  //the moment we change the string to monday we get 
			                                            // enter if block
		}
		System.out.println("end program");
		
		// live example of ! as follows to enter the if block 
		// if the check box is not checked we click on it because it send us adds like Tmobile
		
		boolean checkboxselected = true;
		if (!checkboxselected) {
			System.out.println("I will click on it ");
		}
		
	}

}
