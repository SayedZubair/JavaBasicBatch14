package com.syntax.class5;

import java.util.Scanner;
//to import cont+shift+o
public class RecapSCannerAsel {

	public static void main(String[] args) {
		// to capture differnet values we need to use diffent options 

	
	Scanner input= new Scanner(System.in);
	System.out.println("please enter your name");
	String name=input.next();
	System.out.println("how old are you");
	int age = input.nextInt();
	System.out.println(name+"is"+age+"years old");
	System.out.println("how much money you have");
	double money = input.nextDouble();
	System.out.println(name+"has $"+money);
	System.out.println(name+"what is your grade");
	
	char grade= input.next().charAt(0);
	System.out.println(name+"has grade"+grade);
	System.out.println("plese enter another name");
	name= input.next();
	System.out.println("new name is "+name);
	
	// if we change to char(1) we can have a choice based on the numbers we give to char sayed if say three
	//we get the letter a from sayed because the second letter 
	
	}

}
