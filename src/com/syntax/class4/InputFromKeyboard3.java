package com.syntax.class4;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();// we use nextInt()if we want an int
		                              // type of data from the keyboard"
		System.out.println("please enter your Age");
	
		if(age<18) {
			System.out.println("You should Study");
		}else{
 			System.out.println("you shoud start working");
		}
		
		
		
		}
			
		
}

	


