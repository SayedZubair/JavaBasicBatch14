 package com.syntax.class6;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =10;
		i=i+9;
		System.out.println(i);
		
		i=i-5;
		System.out.println(i);
		i=i*2;
		
		
		// now we do shortHand
		
		int a =10;
		a+=9;
		System.out.println(a);
		a-=5;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		a-=10;
		System.out.println(a);
		a%=4;
		System.out.println("value after mod operation="+ a);
		
	}

}
