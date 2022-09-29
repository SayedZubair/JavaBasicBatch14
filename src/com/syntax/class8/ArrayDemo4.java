package com.syntax.class8;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the number of dresses u wanna buy");
		int noOfdresses=scanner.nextInt();
		double[]prices=new double[noOfdresses];
		for(int i=0; i<noOfdresses; i++) {
			System.out.println("Please enter the price of dress no "+i+1);
			prices[i]=scanner.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		
		//limitation of enhanced for loop
		//we can only go in one direction
		//we cant skip the elements
		//we cant use enhanced for loop to update the elements in an array
		// we can only use it to access the elements 
		double sum=0;
		for(double price:prices) {
			sum+=price;
		}
		System.out.println("total for all the dresses = "+sum);
	}

}
