package com.syntax.class5;

import java.util.Scanner;

public class DefaultValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
	System.out.println("enter the time");
	int hour =(0);
       String timeOfTheDay=null;
        if(hour>=1 && hour<=11) {
        	timeOfTheDay="Morning";
        	
        }else if (hour>=12 && hour <=15) {
        	timeOfTheDay="Afternoon";
        }else if (hour>=16 && hour<=20) {
        	timeOfTheDay="evening";
        }else if (hour>=21 && hour<=24) {
        	timeOfTheDay="Night";
        }else {
        	System.out.println("wrong number is entered");
        	timeOfTheDay="Invalid";
        }
	}
}
