package com.syntax10;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
//		Write a program that reads two people's first
//		names and if they expecting boy or girl? 
//		Based on the input suggests a name for a baby:
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? boy
//		Suggested baby name: DANRY
//
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? girl
//		Suggested baby name: MAIEL
		String fatherName;
		String motherName;
		String firstHalf;
		String secondHalf;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the name of mother");
		motherName=scanner.nextLine();
		System.out.println("please enter the name of father");
		fatherName=scanner.next();
		System.out.println("are u expeccting a boy or a girl ");
		boolean isBoy=scanner.nextBoolean();
		
		
//		String motherName="Mary";
//		String fatherName="Daniel";
//		boolean isBoy=true;
		
		if(isBoy) {
			 firstHalf=fatherName.substring(0,fatherName.length()/2);
			 secondHalf=motherName.substring(motherName.length()/2);
		//	System.out.println(firstHalf+secondHalf);
							
		}else {
			 firstHalf=motherName.substring(0,motherName.length()/2);
			 secondHalf=fatherName.substring(fatherName.length()/2);
			
		}
		System.out.println(firstHalf+secondHalf);
	}

}
