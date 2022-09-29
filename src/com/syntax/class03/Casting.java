package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		  //type casting => type = data type casting = converting 
	    // converting one data type to another data type 

		
		
		byte box1= 127; //smallest box
		short box2 = 3333; // slightly large box 
		int box3 = 45454545; // large box most commonly used 
		long box4 =  25236636363l; // slightly large box 
		float box5 = 34534545f; //larger box 
		double box6 = 353453498; // largest 
		
		// we give order to jave to change a double to int java will accept but we lose some info
		
		int number = (int)15.2; // we cant store the decimal number in a box of type double
		
		System.out.println(number);
		
		// if we convert a larger box to small data type we dont get the result
		int intNumber= 450;
		
		byte smallbox =(byte)intNumber; 
		System.out.println(smallbox);
		
		// the above example are the implicits 
		
		// if we convert a smaller box to a bigger box we can get the result 
		
		short biggerbox= box1;
		
		char a = (char)42;
		System.out.println(a);
		int b = '-';
		System.out.println(b);
		
		int zohra =32;
		double zohra1=32;
		
		int ahmad2= 788;
		byte ahamd3=(byte)ahmad2;
		System.out.println(ahamd3);
		
		int asky2= 'c';
		System.out.println(asky2);
		
		int box9 =(int) box4;
		System.out.println(box9);
		
		long pack1= 2344554l;
		int pack2 = (int) pack1;
		System.out.println(pack2);
		
		byte storage =123;
		int storage1= storage;
		System.out.println(storage1);
		
		double herat = 12.43;
		int herat2 = (int) herat;
		System.out.println(herat2);
		double agha = 23.34;
		float agha2= (float) agha;
		System.out.println(agha2);
		int omid = 33445;
		short omid1=(short)omid;
		System.out.println(omid1);
		
		int  sayed =22233;
		double ahmad=sayed;
		System.out.println(ahmad);
		System.out.println(sayed);
		
		
		// we can say to java to convert it even if the result is not as expected 
	}

}
