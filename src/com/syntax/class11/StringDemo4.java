package com.syntax.class11;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {
	
		String str="Batch,14,is,really,good";
		
		String [] arr=str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);/////it splited to one word
		
		String str2="Today is Sunday.Sunday is good.java is also good";
		String[] arr2=str2.split("[.]");
		System.out.println(Arrays.toString(arr2));
    
		StringUtils sayed =new StringUtils();
		sayed.printAllIndexes(str2, 'T');
		qalandar(33);
	}
	
	public static void qalandar ( int num) {
		System.out.println("hello "+num);
	}

}
