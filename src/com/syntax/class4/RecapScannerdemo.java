package com.syntax.class4;

import java.util.Scanner;

public class RecapScannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * nextline us a special method that can capture spaces ans enter as well 
		 * when we use any method like nextInt() nextboolaaen ()
//
 * ,next Double() and after that if we use nextline() we need to discard that enter by using an extra next line		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your name");
		String name =scanner.nextLine();
		scanner.nextLine();
		System.out.println("please enter your age");
		String age =scanner.nextLine();

		System.out.println(name+"is"+age+"years old");
		
	}

}
