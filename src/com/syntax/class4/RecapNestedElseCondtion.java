package com.syntax.class4;

public class RecapNestedElseCondtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if we have money then buy eggs if we have eggs the make omelette
		// nested if conditions are dependent on each other. if outer is not true inner is never checked
		// inner conditions are only checked when outer condition is passed
		
		int money = 12;
		if (money<15) {
			System.out.println("lets buy some eggs ");
			int noOfeggs= 2;
			
			if (noOfeggs>0) {
				System.out.println("lets boil the eggs ");
			}
		}
		
		///////////////////////////////////////////////////////////////////////////////
		
		

	}

}
