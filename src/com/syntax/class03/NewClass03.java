package com.syntax.class03;

public abstract class NewClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String concatenation helps us combine two Strings together
		
		String firstName = "Mina";
		String lastName = "Henen";
		String fullName = firstName+lastName;
		// to give space between name 
		//String fullName = firstName + "" + lastName;

		System.out.println(fullName);
		
		// String concatenation helps us combine a string with any primitive data type together 
		
		int houseNo = 10;
		int apartmentNo = 5;
		String streetName = "That street";
		String city = "newyork";
		String country = "USA";
		String fullAdress = apartmentNo+" " +houseNo+" " + streetName+" "+city+ " "+ country;
		System.out.println(fullAdress);
		
		System.out.println("if we subtract 10 from 5 we get = " +(10-5));
		// we can do the substract only by using parantes 
		
		
		String familyName = "hashimi";
		String wifeName = "Zohra";
				int age = 27;
				System.out.println(familyName+" "+ wifeName+" and her age is "+age);
		
		
		
	}

}
