package com.syntax.class5;

import java.util.Scanner;

public class SwitchCaseAhmadShah1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of the month");
		int monthNum =input.nextInt();
		//String month = input.next();
		  // with default we can utilize no more syste.out
//		if (month.equals("january")) {
//			num=1;
//		} else if (month.equals("feburay")) {
//			num=2;
//		} else if (month.equals("march")) {
//			num=3;
//		} else if (month.equals("april")) {
//			num=4;
//		} else {
//			System.out.println("invalid");
//		}
//
//		System.out.println(num);
		///////////////////////////////////////////////////////////////////////////////////////////////

		// in switch variable is importnant where u put the informations in
		// we have to have a data type variable to run the process
		// to avoid having alot of System.out we need to make a dafault INT or string. char 
		String month ="";
		switch (monthNum) {
		case 1:
			month="January";
			break;
		case 2:
			month="Februray";
			break;

		case 3:
			month= "March";
			break;
		case 4:
			month="april";
			break;
		default:
			System.out.println("invalid");
			
	
			
		//	now want make them sarfa joye

		}
		System.out.println(" you are in"+ month);
	}

}
