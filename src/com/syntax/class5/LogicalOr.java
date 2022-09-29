package com.syntax.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//////////////////////logical or ||
//   true||true   true
//   true||false  true
//	 false||true  true
//   false||false false
		String day="saturday";
				if(day.equals("saturday") || day.equals("sunday")){
					System.out.println("java class at Syntax");
					
					// if one condition is true there will be an output
				}
				double money = 120000;
						String title="Automation Tester";
				if (title.equals("Automation Tester")  || money==120000){
					System.out.println("Happy");
					
				}
	}

}
