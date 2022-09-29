package com.syntax.class8;

public class TwoDarrayPractice {

	public static void main(String[] args) {
		String[][] countries= {
                {"USA","Canada"},// 1 array index 0
                {"Peru","Brazil","Columbia","Ecuador"},// 2 array index 1
                {"Ethiopia","Egypt","Kenya"},
                {"Germany","Turkiye","Moldova","Ukraine"},
                {"Kazhakhstan","Afghanistan","Korea"},
        };
//        System.out.println(countries.length);// 5 total of array or rows
//        int elementsOf1arr=countries[0].length;
//        System.out.println(elementsOf1arr);
//        int elementsOf2arr=countries[1].length;
//        System.out.println(elementsOf2arr);
//        int elementsOf3arr=countries[2].length;
//        System.out.println(elementsOf3arr);
//
//        System.out.println("=========all values from 2d array============");
        
     	for(int r =0; r<countries.length; r++) { // loops over rows
         for(int c=0; c<countries[r].length; c++) {
          
          		
              System.out.print(countries[r][c]+" ");
              
           }
           System.out.println();
        
           
                    
            ///advanced loop
            
//            for(String[]country:countries) {
//            	for(String c:country) {
//            		
//            		
//            		if (c.equals("USA")) {
//               		System.out.print(c +" my home country ");
//               		System.out.println();
//                	}else {
//                		System.out.print(c+" ");
//                	}
//            	}
//            	System.out.println();
            }
        }
    
        	
	}


