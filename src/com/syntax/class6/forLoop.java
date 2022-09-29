package com.syntax.class6;

public class forLoop {
	public static void main(String[] args) {
		// for loop syntax
		// (intialitian ; condtion ; increment / decrement{
		//code repeated
		//hello 5 times
		//for (int i =1)i<=5; i ++{
			//System.out.println("Hello");
	//	} for loop is the most populr
		for (int i =1; i<=5; i ++) {
			System.out.println("Hello");
		}
	//another example 
		System.out.println("----------------------");
		// print numbers from 1 to 20
		
		for (int i =1; i <=20; i++) {
			System.out.println(i+"");
			
		}
		System.out.println("-------------------------");
		// print numbers from 30 to 10
		for (int i =30; i>=10; i--) {
			System.out.println(i + " ");
		}
		// what is the output
		for (int i=0; i <=10; i+=2) {
			
			System.out.println(i+" ");
		}
		// for loop is the best choice when we know how many times we know in advance
		// if we say i wannat print 20 to 10 since we know how many times to repeat therefore we use 
		// for loop
		
		// in which situation while loop
		// when we dont know how many times there will be the question like u got the job or did u when lottery
		// or when we do know in advance how many times to repeat the block of codes we can have the choice to use 
		// while or do while 
		
		// what is the output
		int sum = 0;
				for (int i = 1; i <=6; i ++) {
					sum +=i;
				}
		System.out.println(sum);///////21
}
}