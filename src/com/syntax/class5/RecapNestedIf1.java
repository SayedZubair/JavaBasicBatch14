package com.syntax.class5;

public class RecapNestedIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cont+shift+f to farmat the code
		boolean allergy = true;
		String allergyType = "milk";
		if (allergy) {
			System.out.println("let me check what allergy yo have");
			if (allergyType.equals("pollen")) {
				System.out.println("try to stay indoor ");
			} else if (allergyType.equals("peanut")) {
				System.out.println("please stay away from peanut");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("stay away from dairy");

				// iner else
			} else {
				System.out.println(" we need to do some test");
			}
			// outer else

		} else {
			System.out.println("you are lucky");
		}

		/////// the outer block is the 1st if and the last else

	}

}
