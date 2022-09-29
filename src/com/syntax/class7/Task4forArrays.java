package com.syntax.class7;

public class Task4forArrays {

	public static void main(String[] args) {
		//4. From an array of integer elements find the largest number.
		int num[]= {2,30,4,5,6,7,8};
		int max=0;
		for(int num1:num) {
			if(num1>max) {
				max=num1;///here we store and assign the largest number 
				
			}
			
		}
		System.out.println(max);
	}

}
