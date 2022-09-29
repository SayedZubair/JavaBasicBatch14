package com.syntax.class5;

public class SwitchIf02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/// switch case plays a smilar rule as if statement 
		
		//we have two conditional statement 
		// if statement
		//switch statment===excecutes ome statement from mulitiple condtion statement 
		int number = 18;// if have to change the num to differnt 
		if(number!=13) {
			System.out.println("this is not 18");// if we have change the number from 18
			
		}
		int day = 1;
		
		if (day==1) {
			System.out.println("monday");
		}else if (day==2) {
			System.out.println("tuesday");
		}else if (day==3) {
				System.out.println("wednesday");
		}else if (day ==4) {
			System.out.println("thursday");
		}else if (day ==5) {
			System.out.println("friday");
		}else if (day==6) {
			System.out.println("saturday");
		}else if (day==7) {
			System.out.println("sunday");
			
			
			}else {
				System.out.println("please enter a valid number");
	}
		String name;
		switch(day) {
		case 1:
			name ="monday";
			break;
		case 2:
			name = "thesday";
			break;
		case 3 :
			name= "wednesday";
			break;
		case 4:
			name="thursday";
			break;
		case 5:
			name="friday";
			break;
		case 6 :
			name="saturday";
			break;
		case 7:
			name= "sunday";
			break;
		default:
			name="invalid";
			////swtic is not conditioned based its value based it direct jumps to the case,,swtich case 
			//can only work with equality
			//what is the syntax
			
			//if statement is conditioned based and executes block by block
			//switch case it knows the values and jumps to the matching case 
	//		switch (varible) {
			
		//	case value1:
				//code A;
			//	break;
		//	case value2:
			//	code b;
			//	break;
				
				/////////////////////////break the moment java finds the matching case then get out
				//////////////////we can use default any location its better to have at the end 
				//// switch is a great alternative for if else if 
				
				
				
				
				
				
				
				
				
			}
		
		}
	
}

