package com.syntax.class6;

public class CountinueKeyword {

	public static void main(String[] args) {
		// contine should be used inside if conditon it skips the current condition and says go back to the 
		//bigining  of the loop
for (int i=1;i<5;i++) {
	if(i==3) {
		continue;
	}
	System.out.println("hello");
	System.out.println("how are you");
	System.out.println(i);
}

// I want to print numbers from 1 to 20 except num 3 7 11
for (int i = 1; i<=20;i++) {
	if (i==3|| i==7|| i==11) {
		continue;
	}
	System.out.println(i+" ");
}
	}

}
