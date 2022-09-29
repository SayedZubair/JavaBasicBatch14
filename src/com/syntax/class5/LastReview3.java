package com.syntax.class5;

import java.util.Scanner;

public class LastReview3 {

	public static void main(String[] args) {
		
		
		// not perator turns the answer to true if the answer is false from input 
		Scanner scanner = new Scanner(System.in);
System.out.println("please enter if you are comfortable with java logical operators ");
boolean goodWithOp=scanner.nextBoolean();
if (!goodWithOp) {
	System.out.println("do some more research solve some repls and take some rest");
}


	}

}
