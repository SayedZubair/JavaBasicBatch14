package com.syntax.class5;

import java.util.Scanner;

public class SecondAssignment {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your country name ");
		String countryName= input.nextLine();
        String language="";
        switch(countryName) {
        	case "USA":
        		language="english";
        		break;
        	case "afghanistan":
        		language= "dari";
        		break;
        	case "italy":
        		language="italian";
        		break;
        		default:
        			System.out.println("invalid ");
        }
      ////// ustad ahmad has to explain more  if(!language.equals("")) {
        	 System.out.println("you speak "+(language));
        }
       
	}
