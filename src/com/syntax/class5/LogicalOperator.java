package com.syntax.class5;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// logical operator
		// assignment operator :=
		// Arithemetic :+/-*./ %
		// relational >.<=.==1=
		// Logical  && ||
		// and (&&)conditions are as follows
		// true&&true -true
		// true-false-flase
		// false&&-ture=false
		// false - false= false
		// we can add as many as possible conditions in && 

		// logica && is to test two or more condition together to get the out all the
		// condition should be true
		boolean understandJava = false;
		boolean enjoyJava = true;
		boolean practice = true;
		if (understandJava && enjoyJava && practice) {
			System.out.println("this is awesome");
		}

		// another example let find the largest num
		int n1 = 100;
		int n2 = 200;
		int n3 = 300;
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + "is the largest");
		} else if (n2 > n3 && n2 > n1) {
			System.out.println(n2 + "is thr largest");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + "is the largest");
		}

		/*
		 * 
		 */
	}

}
