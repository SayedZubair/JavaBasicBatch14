package com.syntax.class5;

import java.util.Scanner;

public class NewHomeworkDone {

	public static void main(String[] args) {
		
		//1. Ask user to enter their country and capture it.
	    //Once values are captured print which language user speaks.
		Scanner input=new Scanner(System.in);
		System.out.println("enter your country Name");
		String nameOfCountry=input.next();
		String language=null;
		switch(nameOfCountry) {
		case "USA":
			language="english";
			break;
		case "Italy":
			language="italian";
			break;
		case "afghanistan":
			language= "dari";
			break;
		case "India":
			language= "indian";
			break;
			default:
			System.out.println("invalid");
			
		}
		System.out.println("you speak "+language);
	}

}
