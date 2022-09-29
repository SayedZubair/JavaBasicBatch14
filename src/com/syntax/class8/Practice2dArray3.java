package com.syntax.class8;

public class Practice2dArray3 {

	public static void main(String[] args) {
		

	        String[][] arr= {

	                {"Yusuf", "Hamza", "Adam", "John"},
	                {"A", "B", "C", "D"}
	              
	        };


	        for(String[] singleArray:arr) { //loops over 2d or single array
	        	// singleArray= {"Yusuf", "Hamza", "Adam", "John"},
	        	
	            for(String el:singleArray) { //loops over each element of the 1d Array
	                System.out.print(el+"  ");
	            }

	            System.out.println();
	        }

	        System.out.println(" ---------------------------- ");


	        for(int i=0; i<arr.length; i++) {

	            for (int j=0; j<arr[i].length; j++) {
	                System.out.print(arr[i][j]+"  ");
	            }
	            System.out.println();
	        }

	   
	}

}
