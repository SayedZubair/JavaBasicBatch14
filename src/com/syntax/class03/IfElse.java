package com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short box = 132;
		byte box2 = (byte)box;
		System.out.println(box2);

		// we get a wrong reslut if we attemp to put big number to smaller one 
		
		// what type casting ?
		//type casting is convering one data type to another data type 
		//why should i learn data casting ?\
		// so that we can use the code that is wriiten by someone else to make our life easier 
		// or when we will be working in teams we can merge the code
		// what the syntax for type casting 
		// when are converting something smaller to larger we dont need to do anything 
		// it happens automatically we just assign the variable 
		
		int box3= 1234;
		long box55 = box3; // this is how it works and it is called implicit or widening automatic 
		
		// if we convert a larger to smaller  this is how we do 
		long box7 = 1777777;
		int box6 =(int)box7; // narrowing or expicit or manual conversion 
		System.out.println(box6);
		
		
	
		
	}

}
