package com.syntax10;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 2525235357!@##% SRFSGSERGRG rgsgesgegeg";
		
		// replace method replces one string'
		System.out.println(str.replace("good", "excellent"));
		System.out.println(str.replaceAll("[a-z]", "B"));
		
	}

}
