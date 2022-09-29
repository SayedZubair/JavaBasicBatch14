package arrayHomework;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
//		2. Using Scanner create an array of countries. When an
//		array is created, retrieve all values from it and while
//		retrieving those values print capital for each country.
//		(use 2 different loops).
		Scanner input = new Scanner(System.in);
		System.out.println("enter your Array Size");
		int arraySize= input.nextInt();
		String[][] countries=new String[2][arraySize];//as we know we have countries and capitals so we need
		// this is for retrieving the infos				// to verfy two rows
		for(int i =0; i<countries.length;i++) {
			if(i==0) {
				System.out.println("enter the country");
			}else {
				System.out.println("enter the capital");
			}
			int counter=0;
			while(counter<countries[i].length) {
				
				String name=input.next();
				countries[i][counter]=name;
				counter++;
			}
		}
		
		// the following for are to print out the 2d elements.
		
		for (String[] row:countries) {
			for(String name1:row) {
				System.out.print(name1+"\t");
			}
			System.out.println();
		}
		
	}

}
