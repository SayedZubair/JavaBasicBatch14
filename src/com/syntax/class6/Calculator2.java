package com.syntax.class6;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		   Scanner aaa = new Scanner(System.in);
	        System.out.println("Enter 1st Number");
	        double num1 = aaa.nextDouble();

	        System.out.println("Enter 2nd Number");
	        double num2 = aaa.nextDouble();

	        System.out.println("Enter the operator");
	        char op = aaa.next().charAt(0);
	      

	        double result = 0;
	        boolean wrongOperator=true;

	        if (op == '+') {
	            result = num1 + num2;
	        } else if (op == '-') {
	            result = num1 - num2;
	        } else if (op == '*') {
	            result = num1* num2;
	        } else if (op == '/') {
	            result = num1 / num2;
	        } else {
	            System.out.println("Enter valid operator");
	            wrongOperator=false;
	        }

	        if (wrongOperator) {
	            System.out.println(result);
	        }

	}

}
