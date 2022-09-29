package arrayHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task2Asghar {

	public static void main(String[] args) {
//		2. Using Scanner create an array of countries and capitals. When  
//		array is created for country and the capital, retrieve all values from it and while
//		retrieving those values print capital for each country.
//		(use 2 different loops).
		Scanner input = new Scanner(System.in);
		System.out.println("how many contries u want to store");
		int size= input.nextInt();
		// two arrays one to store the counties and the other one to store the capitals
		String[]countries=new String[size];
		String[]capitals =new String[size];
		input.nextLine();//this is just to consume that extra enter that we will be getting from line 15
		for(int i=0;i<size;i++) {
			System.out.println("please enter thr country name");
			countries[i] =input.nextLine();
			
			System.out.println("please enter the capital for "+ countries[i]);
			capitals[i]=input.nextLine();
		}
		// print the arrays in good format
	System.out.println(Arrays.toString(countries));
	System.out.println(Arrays.toString(capitals));
	
	for(int i=0; i<size;i++) {
		System.out.println("the country "+countries[i]+" has the capital "+capitals[i]);
	}
	}

}
