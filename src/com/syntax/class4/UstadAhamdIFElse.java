package com.syntax.class4;

public class UstadAhamdIFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// making decision with Java 
		// each if has a condition if true enter If block otherwise else block
		// if we have two condtions we use if and else 
		// if we have multiple conditions we use if else if
		
		int condition = 2;
		if(condition == 2) {
			System.out.println(" condition is true ");
			
		} else { 
			System.out.println(" condition is false");
		}
		
		int studentScore = 100;
		if(studentScore==100) {
			System.out.println(" first grade");
		} else if (studentScore >= 90) {
			System.out.println("second grade");
		}else if (studentScore>=80) {
			System.out.println("third grade");
		}else {
			System.out.println("failed");
			
			int tv = 54;
			if (tv ==55) {
				System.out.println(" we will buy it");
					
			} else {
				System.out.println(" we will buy another tv");
			}
		}
			
		
		
		
	}

}
