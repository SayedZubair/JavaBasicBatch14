package com.syntax.class5;

import java.util.Scanner;

public class Lastreview8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//similar to if else
		// why should know switch 
		//1->its cleaner
		//2-> its 
		// with switch case does not work with big numbers because it give the direction so its usless
		// swich case simplyfies to find the particular box 
		// always use swich case if have the posiblites 
		// if the string is empty we cant print the name of the variable because its we have to give a name;;
		// switch is case a statement 
		
		Scanner scanner= new Scanner(System.in);
		System.out.println();
		int day = scanner.nextInt();
        String name;
        
   

     switch(day) {

     case 1:
         name="Monday";
         break;
     case 2:
         name="Tuesday";
         break;
     case 3:
         name="Wednesday";
         break;
     case 4:
         name="Thursday";
         break;
     case 5:
         name="Friday";
         break;
     case 6:
         name="Saturday";
         break;
     case 7:
         name="Sunday";
         break;
     default:
          name="Invalid";
          break;
}
     System.out.println(name);
	}

}
