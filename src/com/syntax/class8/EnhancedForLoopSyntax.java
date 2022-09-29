package com.syntax.class8;

public class EnhancedForLoopSyntax {

	public static void main(String[] args) {
		//enhanced for loop syntax
	///	for (dataType variable name:nameOfArray) {
		
		
	String[][] names =new String [2][3];
	names[0][0]= "sayed";
	names[0][1]="ahmad";
	names[0][2]="kabir";
	
	names [1][0]="mr";
	names [1][1]="agha";
	names[1][2]="miss";
	
	System.out.println(names[1][0]+ " " +names[0][0]);
	System.out.println(names[1][1]+" "+names[0][1]);
	System.out.println(names[1][2]+" "+names[0][2]);
			
	System.out.println("-----------------------------------");
	
	String[][] student = {
			
			
			{"ahmad","zaki","rasul","maqsoud"},
			{"A","B","C","D"},
			{"excellent","good","poor","bad"}
			
			};
//	System.out.println(student[0][0]+" = "+ student[1][0]);
//	System.out.println(student[0][1]+" = "+ student[1][1]);
//	System.out.println(student[0][2]+" = "+ student[1][2]);
//	System.out.println(student[0][3]+" = "+ student[1][3]);
//	
	System.out.println("--------------------------------------------------------------------");
	
	for(String row[] :student) {
		for(String colomn:row){
		
				
				System.out.print(colomn+" ");
			}
		System.out.println();
	
	}
	
	for(int i =0; i<student.length; i++) {
		for(int j=0; j<student[i].length; j++) {
			System.out.print(student[i][j]+" ");
		}
		System.out.println();
	}
		

		}

	}

