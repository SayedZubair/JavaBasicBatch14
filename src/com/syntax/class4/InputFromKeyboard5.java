package com.syntax.class4;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve Repl Assignments");
		boolean solvedAnyRepls = scanner.nextBoolean();
		
		if (solvedAnyRepls){
					System.out.println("How many repls you solved");
					int noOfReplsSolved = scanner.nextInt();
					if (noOfReplsSolved>=17){
						System.out.println("you are doing great");
					}else if(noOfReplsSolved>10) {
						System.out.println("You are doing ok Please complete them as soon as possible");
					}else  { 
						System.out.println("you should solve some more reples");
					}
		}
		else
		{
			System.out.println("they are very important to learn java please solve them");
		}

	}
}
