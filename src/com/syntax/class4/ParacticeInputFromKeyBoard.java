package com.syntax.class4;

import java.util.Scanner;

public class ParacticeInputFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ahmad = new Scanner(System.in);
		
		System.out.println("Enter your age: " );
        int age = ahmad.nextInt();
        if (age<18){
        	System.out.println("you cant buy wine");
        }else {
        	System.out.println("take your wine");
        }
        	
	}

}
