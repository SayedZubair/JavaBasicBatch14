package com.syntax.class6;

public class nestedLoops {

	public static void main(String[] args) {
		//nested loops - loop inside another loop
		for(int i=1; i<3; i++) {  //--->outter controls inner loop
			System.out.println("hello");
			for(int j=1; j<=3; j++){//--->inner loop depends on outter loop
				System.out.println("bye");
			}
			
		}
		System.out.println("-----------------------------------");
		for (int i=0; i<2;i++) {
			
			for (int j = 1;j<4; j++) {
				System.out.println(i+" "+j);
		
	   		}
			System.out.println("end of the code");
	    }

	}
}