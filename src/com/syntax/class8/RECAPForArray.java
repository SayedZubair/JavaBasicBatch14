package com.syntax.class8;

public class RECAPForArray {

	public static void main(String[] args) {
		// array is container objects that store and holds multiple value of the same type
		//we need it because it saves time
		//how do we create an array?
		int[] nums=new int[3];/// we should specify the elements
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		System.out.println(nums[2]);
     //   nums.length;   // tells how many elsements 
		// how to get all the element from an array;
		for(int i =0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-----------------------------------------------");
		
		//Advanced for loops works only when we work with array or collection
		//it loop only 1 direction
		for(int num:nums) {
			System.out.println(num);
		}
	}

}
