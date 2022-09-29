package com.syntax.class7;

public class ArrayTask {

	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D, 
		//Then print a grade B (use 2 different ways of creating an array).

		char [] alphabits =new char[4];
		alphabits[0] = 'A';
		alphabits[1]='B';
		alphabits[2]='C';
		alphabits[3]='D';
		System.out.println(alphabits[1]);
		
		char [] alphabits1 = {'A','B','c','d'};
		System.out.println(alphabits1[1]);
		
		//Create an array of names and store all names of your group. Then print your name from that array.
		//(use 2 different ways of creating an array).
		
		String[]names=new String[4];
				names[0]="Sayed";
				names[1]="Mirwais";
				names[2]="Matin";
				names[3]="mustafa";
				System.out.println(names[0]);
				
		String[]names1= {"Sayed","Mirwais","Matin","mustafa"};
		System.out.println(names1[0]);
		
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array:
	   //	“Saturday is Java coding Day”.
		
		
	}

}
