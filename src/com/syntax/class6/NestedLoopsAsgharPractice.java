package com.syntax.class6;

public class NestedLoopsAsgharPractice {

	public static void main(String[] args) {
		for (int i=0; i<3;i++) {
			System.out.println(i);
		}
		for (int i=0; i<3;i++) {
			System.out.println(i);
	}
		for (int i=0; i<3;i++) {
			System.out.println(i);
		/// instead of the above we can do this 
	}
		for (int j=0; j<3;j++) {
			for (int i=0; i<3; i++) {
				System.out.println(i);
			}
		}
		// we can have a while or do loop inside a for loop and it nested 
}
}