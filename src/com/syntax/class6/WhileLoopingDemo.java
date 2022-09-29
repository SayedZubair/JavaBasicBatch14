package com.syntax.class6;

public class WhileLoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print all the numbers from 50 to 20
		//print all the even numbers from 1 to 20
		
		int c = 50;
		while(c >= 20 ) {
			System.out.print(c + " ");
			c--;
		}
		System.out.println();
		int a = 1;
		while(a<=20) {
			a++;
			if(a%2!=0) {
				System.out.println(a+" ");
			}
			
			
		}

	}
 }

