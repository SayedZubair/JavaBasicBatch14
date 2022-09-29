package com.syntax.class6;

public class DigitalClockNestedLoop {

	public static void main(String[] args) {
		//Create a digital clock using nested loops:
		//If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes
		for (int hour=0; hour<=23; hour++) {
			for(int min=0; min<=59; min++) {
				System.out.println(hour+":"+min);
				
			}
		}
	}

}
