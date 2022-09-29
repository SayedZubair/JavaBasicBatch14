package arrayHomework;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
//		7. Write a java program to check whether a given
//		number is prime or not?
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter your the number");
		int num = input.nextInt();
		boolean isPrime=true;
		for(int i=2; i<num; i++) {
			if (num%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
		System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
