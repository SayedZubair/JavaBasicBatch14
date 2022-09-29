package com.syntax.class7;

public class Task6forArrays {

	public static void main(String[] args) {
		String[]week= {"monday","sunday","tuesday","thursday","friday"};
		// if day is sunday its funday otherwise its a boring day
		
			for (String day:week) {
			if(day.equals("Sunday")) {
				System.out.println(day+"is a fun day");
			}else if(day.equals("sunday")) {
				System.out.println(day+"is a relax day");
			}else {
			System.out.println(day+"is a boring day");
			}
		}

	}

}
