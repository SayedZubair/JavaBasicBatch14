package com.syntax.class6;

public class ashgarInterviewLoopQuestion {

	public static void main(String[] args) {
		// i want to print this pattern 10 8 6 4 2 0 
		
		for (int i = 10; i>=0; i=i-2) {
		
				System.out.println(i+" ");
			}
		/////////
		// I want to print 9 5 1 
		for (int i =9; i>=1; i-=4) {
			System.out.println(i);
		}
		System.out.println("**********************************************8");
		/////////////////
	//	print 1 3 7 9
		for (int i = 1; i<=9; i+=2) {
			if( i==5) {      ////or if(i!=5){ then we should put the syso inside
				continue;
			
			}
			System.out.println(i);
		}
		}



}
