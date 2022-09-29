package com.syntax.class4;

public class RcapNestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// we use two elses because I want them to be depended 

		boolean studyhard= true;
		if (studyhard) {
			System.out.println(" we get a job in first few weeks ");
			boolean goodcommunicationskill=false;
			if(goodcommunicationskill) {
				System.out.println("we might get a job in apple");
			}
			else {
				System.out.println("we need to work on our communication skills");
			}
		}else
		{
			System.out.println("it might take a longer time to get a job");
		}
	}

}
