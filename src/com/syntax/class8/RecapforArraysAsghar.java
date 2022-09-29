package com.syntax.class8;

import java.util.Arrays;

public class RecapforArraysAsghar {

	public static void main(String[] args) {
		// what if we store all the names of the class in a variable instead of creating alot of 
		//variables
		// arrays are consective memory locations which store same type of data
		//why we need arrays: arrays help us store large amount of data in a single variable.
		// for example. if we want to store the names of 100 students we dont need to create
		// 100 variables we can simple create an array of size 100 and it will store the names
		//syntax(how to use):
		// data type[]name of the array; new data type[size]
		//data type []names of the arrat; new data type[]nstore the elemants}
	//	String name="ahamd";
	//	String name1="maqsoud";
		//String name2="kabir";
		// we cant keep creating variables and store a name for the entire class.
		
		// one of the rare way of creating a varianble in the real life we mostly dont use;
//		String[]names=new String[] {"huma","Janel","Anna"};
//		System.out.println(names[0]);
//		
		// to now the number of the elements in the array.
		int[]arr=new int[] {10,20,30};
		// last index is always size- because arrays 
		// index start from zero
		System.out.println(arr.length);
		for(int i =0;i<arr.length; i++ ){
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	
	}
	

}
