package com.syntax.class7;

public class Task2ForArrays {

	public static void main(String[] args) {
		//2. Create an array of animals and store 5 elements into it.
		//Using 2 different loops print all elements from the array.
		String[] animals =new String[5];
		animals[0]="Dog";
		animals[1]="Cat";
		animals[2]="Donkey";
		animals[3]="Cow";
		animals[4]="Lion";
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		
		}
		System.out.println("--------------------------------------------------");
		for (String animals1:animals) {
			System.out.println(animals1);
		}

	}

}
