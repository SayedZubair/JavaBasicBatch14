package com.syntax.class8;

public class TwoDarrayes {

	public static void main(String[] args) {
		// types of arrays 2D 3D it can have multiple rows and multiple columns.
		
		int[][] bigArray=new int[3][4];
		//1 row
		bigArray[0][0]=10;
		bigArray[0][1]=10;
		bigArray[0][2]=10;
		bigArray[0][3]=10;
		//2 row
		bigArray[1][0]=100;
		bigArray[1][1]=200;
		bigArray[1][2]=300;
		bigArray[1][3]=400;
		//3 row
		bigArray[2][0]=1;
		bigArray[2][1]=2;
		bigArray[2][2]=3;
		bigArray[2][3]=4;
		//in 2d array we need to have always nested loop
		//how to accept element from 2d array.
		System.out.println("0\t1\t2\t3\t4 ");
		for(int i=0; i<bigArray.length; i++) {
			for(int j=0; j<bigArray[i].length;j++) {////here.length gives the # of colomns
				System.out.print(bigArray[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		///shorter way of 2dArray
		int[][]arr= {
				{10,20,30,40},
				{100,200,300,400},
				{1,2,3,4},
				
		};
			
		System.out.println(arr[1][3]);
	
	}

}
