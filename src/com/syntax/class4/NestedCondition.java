package com.syntax.class4;

public class NestedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// it is called outer if condition, if true then inner condtion will be checked
        // if it is false nothing from inner if condition will be executed it is
          // like the main door 
           // if main door is closed we cant enter the building 
            // as string is a non primitive we cant use == sign we have to use
            // .equal method 
		int time =5;
		String day = "monday";
		//outer if condition 
		if (day.equals("monday")) { 
			// inner if condition 
			if (time>7) {
				System.out.println("lets go to office");
			}
			if (time<6) {
				System.out.println("lets sleep more");
			}
		}

	}

}
