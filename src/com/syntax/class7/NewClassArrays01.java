package com.syntax.class7;

public class NewClassArrays01 {

	public static void main(String[] args) {
		//Arrays in java -
		//is a collection of similar type of data
		//is a container object that hold value 
		
	//	int a=10;
		//we cant do int a = 10, 20, 30;
		// what if we wanna do that .. we can do with the help of arrays
		// array is a bigger backet storing many nums of the same data type.
		
		
		int[] arr =new int[4];
		//we store elsements inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//accessing elements from the array
		System.out.println(arr[2]);
		System.out.println(arr[1]+arr[2]);
		
		//lets create an array and store your classmates
		String[]name=new String[5];
		name[0]="shah";
		name[1]="vera";
		name[2]="Roman";
		name[3]="Guljan";
		name[4]="Sayed";
		
		System.out.println("hello "+name[1]);
		
	}

}
