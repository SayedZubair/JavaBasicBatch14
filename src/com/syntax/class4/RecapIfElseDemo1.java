package com.syntax.class4;

public class RecapIfElseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * to assign a primitive we use == to assign a string we use.equals()
		 */

		String userName= "Admin";
				String Password="password123";
				if(Password.equals("password123")){
					System.out.println("welcome "+userName);
	
				}
				else
				{
					System.out.println("wrong password"+userName);
				}
	}

}
