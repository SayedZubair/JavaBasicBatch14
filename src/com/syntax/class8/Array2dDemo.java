package com.syntax.class8;

public class Array2dDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] individualsroom1 = new String[] {"sabej","shah","mina"};
		String[] individualsroom2 = new String[] {"ahamd","kabir","sami"};
		String[] individualsroom3 = new String[] {"rashid","baba","yaar"};
		
		String[][] room= new String[3][];
		
		
		room[0]=individualsroom1;
		room[1]=individualsroom2;
		room[2]=individualsroom3;
		System.out.println(room[2][2]);
	}

}
