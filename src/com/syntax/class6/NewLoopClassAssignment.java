package com.syntax.class6;

import java.util.Scanner;

public class NewLoopClassAssignment {

	public static void main(String[] args) {
			// 1- from the range of 1 to 50 
		// please find the sum of all even and all odd numbers
		
		
		int sumOdd=0;
		int sumEven=0;
		for(int i =1;i<=50;i++) {
			if(i % 2 ==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
				
			}
		}
		System.out.println("sum of odd numbers-"+ sumOdd);
		System.out.println("sum of Sum numbers-"+ sumEven);
	}
}