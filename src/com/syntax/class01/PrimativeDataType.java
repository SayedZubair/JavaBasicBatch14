package com.syntax.class01;

public class PrimativeDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // storing and representing numeric values
		
		//=  means storing
		// varial means box or storage 

		// storing and representing whole numbers
		byte box1 = 127;
		short box2 = 32767;
		int  box3 = 100000000;       // popular
		long box4 = 1000000L;  
		// for long we have to add L at the end just make understand that is long( this can be used for credit cards
		
		
		// storing and representing decimal values
		float variable = 1.99f;   // we add f to represents its double 
	    double variable2 = 99.99;  // popular 99% use it 
	    double variable3 = 22.0;    // we can add zero 
	    
	    // Non nomeric values
	    double total = box1 + box2 + box3 / box4 * variable + variable2 - variable3;
	    System.out.println("the total of all variables is " + total );
	    
	    // storing single characters
	    
	    char container = 'A';
	    char doller = '$'; 
	    System.out.println(container);
	   
	    // storing yes or no values 
	  
	    boolean hot = true;
	    boolean tired = false; 
	  
  
        System.out.println(hot);
 
	}   
  
 
}
