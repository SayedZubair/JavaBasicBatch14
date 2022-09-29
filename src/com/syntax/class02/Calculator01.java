package com.syntax.class02;

public class Calculator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 89.01;
		double num2 = 21.12;
		double total = num1 + num2;
		
	
		System.out.println("The sum of two numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2) );
		System.out.println("The subtract of two numbers " + num1 + " and " + num2 + " is equal to " + (num1 - num2) );
		System.out.println("The multiply of two numbers " + num1 + " and " + num2 + " is equal to " + (num1 * num2) );
		System.out.println("The division of two numbers " + num1 + " and " + num2 + " is equal to " + (num1 / num2) );
		// we can use the variable total instead of (num1 + num2)
		
		System.out.println("The square of the 3.9 is  " + (3.9*3.9) );
		
		double wieght = 5;
		double height = 8;
		double area = wieght * height;
		double perimeter = 2 * (wieght + height );
	
		System.out.println("The perimeter of a rectangle with width " + wieght + " and height " + height + 
				" is equal to " + perimeter + " and the area is " + area );
		
	}

}
