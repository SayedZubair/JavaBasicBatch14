package com.syntax.class4;

public class NestedIfCondtion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		
		  double moneyInMyAccount = 100000;
		String season = "spring";
	   	if (season.equals("spring")) {
		
				if(moneyInMyAccount>30000) {
					System.out.println("lets go vacation");
				}
				else {
					System.out.println("i need to save more");
				}
	    }
	}
}
