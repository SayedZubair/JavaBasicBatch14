package com.syntax.class4;

public class RecapIfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// if we need one outcome based on if condition we use if
		//if the outcomes are two we use if else if outcomes are more than than we use if else if 
		
		// now we wanna have many outcomes technically we can but we should not do that 
		
		int number= 12;
		if (number> 0 ){
			System.out.println("Number is positive");
		}
		if (number<0) {
			System.out.println("Number is negative");
		}
		if (number==0) {
			System.out.println("number is 0");
		}	
		/////////////////////////////////////////////////////////////////////
		/////this is better because it requires less number of steps to give the output , if we debug we can 
		// in if condition all will be checked and the program will be super slow .. even if the 1st is true
		// still it will check all the below programs 
		// when ever we have to check more than two condition always use if else if conditions
		if (number>0)
		{
			System.out.println("number is positive");
		}
		else if (number<0) {
			System.out.println("number is negetive");
		}
		else {
			System.out.println("number is 0");
		}
	}

}
