package com.syntax.class5;

public class LastReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////logical operators 
		//logical operator help us test more than one condition. in java we have && as the and operator 
		//and || or operator and !NOT operator.
		// why should we learn how can they make this easeir / if we have many condition like 5 conditions 
		// we habe to write 5 if else condition 
		// how we know that we can not use logical operators 
		// when for each condition the output is different we can not use logical operators
		// we can use only if we have the same out under many conditions,
		// what is the syntax 
		//if(conditon1 && conditions2)
		
		//other wise we have to use nested if 
	//	if (condition) {
		//	 if (condition2)
		
		//then any statement that will result to same condition we use logical operator 
// how to know which one u can use..
//	u should be a munnal tester , u should know programming .. u should have experience 
	//then we use the logical and && the result if u have all the conditions are true the u can be a tester.
		
		// we do the same in nested if in class 7  ... they behave the same 
	boolean programmer= true;
	boolean manualTester= true;
	boolean knowFramework=true;
	if (programmer && manualTester&&knowFramework) {
		System.out.println("you can be an automation enginner ");
	}else {
		
		System.out.println("you must know a programming language and manual testing or some framework"+ "to be an automation ");
	}
	/// so both the conditions should be true to print the 1st condition otherwise 
}
}

