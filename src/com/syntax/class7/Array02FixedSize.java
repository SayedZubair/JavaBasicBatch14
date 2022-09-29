package com.syntax.class7;

public class Array02FixedSize {

	public static void main(String[] args) {
		int[]nums=new int[3];
		// if we dont start with index 0 .... in array the first storge will be 0 even if we dont use it
		// if dont store we just waste the space 
		nums[1]=12;
		nums[2]=13;
		System.out.println(nums[0]);
		/// we store more elements more than we asked the compilar will not give error but when we run
		// we get an error thats why we should say that array is fixed in size.
		String[] colors=new String[3];
		colors[0]="white";
		colors[1]="pink";
		colors[2]="black";
	//	colors[3]="yellow";/////this the extra one and we get an error 
		
	}

}
