package arrayHomework;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
	//	8. Write a Java Program to print the first 10 numbers of
	//	Fibonacci series.
   // the syntax for the bibonacci
		
		int fab []= new int[10];
		fab[0]=0;
		fab[1]=1;
		// we need this for to have our fibonacci numbers calculated.
		for(int i =2; i<fab.length; i++) {
			fab[i]=fab[i-2]+fab[i-1];
	//	System.out.print(fab[i]+" ");
		}
		
		System.out.println(Arrays.toString(fab));
	}

}
