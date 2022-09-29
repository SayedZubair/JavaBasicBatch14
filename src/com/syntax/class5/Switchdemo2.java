package com.syntax.class5;

public class Switchdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//matching case must of the same data type as a variable
		// no duplicate cases in switch cases 
		
		//limitations of switch case
		//switch case canot use logical operators &&||!
		// switch case can not use relational operators ><=
		// switch case can not work with boolean values since there no enough  cases it gives compiler error 
		// switch case cannot work float/double and long data types can not work with decimals 
		//swich case work with int shot byte and char and string 
		
		char choice = 'M'; // means yes
		String answer;
		switch (choice) {
		case 'Y':
			answer = "Yes";
			break;
		case 'N':
			answer = "No";
			break;
		case 'M':
			answer = "Maybe";
			break;
		default:
			answer = "Unknow";
			break;

		}
System.out.println(answer);
	}

}
