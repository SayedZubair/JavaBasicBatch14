package com.syntax.class8;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// new way of creating array and printing them
		int size=10; //float double are not allowed for array because of decimals 
		int[]arr=new int[size];
		for (int i=0; i<arr.length;i++) {
			arr[i]=i;
			System.out.print(arr[i]+" "); // we can never have the[i] outside the for 
		}
		arr[3]=23;
		System.out.println(Arrays.toString(arr)); // this converts the Arrays to String 
		
		
		int size1=10;
		int[]arr1=new int[size1];
		int start=11;
		for(int i =0; i<arr1.length; i++) {
			arr[i]=start;
			start++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
