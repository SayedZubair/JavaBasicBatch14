package com.syntax.class4;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// type casting is converting data type from one to another;
		// we have two types of type casting 1.Explict / narrowing/ manual  means we put the large box to small box 
		// 2 - Implict/ widening/automatic when we go from a smaller data type to a larger one it is called we 
		//call it implict/widening/automatic visa versa is the first one 
		// byte fits 8 bits,, short(16 bits) if we put a large box to a small we might lose data ,, 
		//char (16 bits) int(32 bits) long (64 bits) 
		// float (32) even it fits 32 bit but its larger than large data type the reason is because it contains
		// the decimals 
		//double(64 bits)
		//byte ->short,char->int->long->float->double
		
		//why we need;
		// when we are working in teams we might need to convert data from different data types or when we are 
		//working with math some times we need to get rid of decimal part as we are only interested in non
		//decimals part.
		//explicit/widening/Automatic
		
		short largerBox= 127;
		byte smallerBox = (byte)largerBox;
		System.out.println(smallerBox);
		
		
		int largerBox1=129;
		short smallerBox2= (short)largerBox1;
		System.out.println(smallerBox2);
		
		// since we can fit the mentioned numbers in the boxes so we get right answer otherwise wrong 
		//answer
		
		//implict/ widening / automatic
		
		short smallerBox3=54;
		long largerbox3=smallerBox3;
		////////////////////////////////////////////////////////////////////////////////////////////
		// if statements: if else conditions allow us to write programs that can take decision based on some 
		//conditon and provided data
		 //if condition
		//if else condition 
		// if else if condition 
		// nested if else condtion 
		// why we learn 
		//when we are solving real life problems 
		// like testing a web site our program needs to make decisions 
		// what is the syntax of if else condition 
		// if condtion 
		boolean rich = false;
		System.out.println("lets buy egg noe ");
		if (rich ) {
			
			System.out.println("lets buy a jet Island ");
		}
		System.out.println("lets buy milk fo breakfast ");
		
		
		// we can an give a int 
		
		boolean rich1 = false;
		System.out.println("lets buy egg noe ");
		int money= 5000000;
				if (money>300000)
		if (rich1 ) {
			
			System.out.println("lets buy a jet Island ");
		}
		System.out.println("lets buy milk fo breakfast ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
