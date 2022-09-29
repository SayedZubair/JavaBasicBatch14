package com.syntax.class4;

import java.util.Scanner;

public class ParacticeWithMe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Number years you worked");
		int years=input.nextInt();
		System.out.println("what is your annual salary");
		int salary= input.nextInt();
		if(years>=5) {
			System.out.println("user is eligible for the bounes ");
			
		}else {
			System.out.println("User is not eligible for the bounes");
		}
		if(salary>50000) {
			System.out.println("bounes = 5000");
		}else {
			System.out.println("bounes =3000");
		}
			

	}

}
