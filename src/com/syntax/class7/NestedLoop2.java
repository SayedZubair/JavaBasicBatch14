package com.syntax.class7;

public class NestedLoop2 {

	public static void main(String[] args) {
//		boolean day =true;
//		for(int i=1; i<=3; i++) {
//			while(day) {
//				System.out.println("good day");
//			}
//		}
				//the above one is infinit loop as while is always true

		
			boolean day =true;
		for(int i=1; i<=3; i++) {
			while(day) {			
				System.out.println("good day");
				break;
	}

			System.out.println(i);
		
		}	
		// the above is infinit too bcause the condition is true it never jumer to line 21 
		
		//if put the break under while loop we will not have infinit
	}

}
