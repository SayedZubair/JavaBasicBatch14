package com.syntax.class6;

public class NestedLoopsAsghar3 {

	public static void main(String[] args) {
		//1 2 3 4 5
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		//1 2 3 4 5 
		// fist we can copy paste the for loop 5 times but its wrong 
		for(int j=0; j<5; j++) {
			for (int i =1; i<=5; i++ ) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
