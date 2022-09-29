package arrayHomework;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
//		1. Using Scanner create an array of integer values. After
//		the array is created, calculate the sum of all stored
//		elements in that array.

	Scanner input = new Scanner(System.in);
	System.out.println("enter your Array Size");
	int arraySize= input.nextInt();
	int[]nums= new int[arraySize]; /// for best practice we need to ask the customer the number arrays.
	for(int i=0; i<arraySize; i++) {/// we cant use advanced for as we can give values to it..
		System.out.println("enter index "+i+" value ");
		int number = input.nextInt();
		nums[i]=number;
		
	}
	int total=0;
	for(int sum:nums) {//// each time add one number and hold to the sum
		total+=sum;
		
	}
	System.out.println(total);
	}

}
