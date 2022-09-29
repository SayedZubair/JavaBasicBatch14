package com.syntax09;

public class Person {
	String name; 
	int age;
	double weight;
	boolean isFunny;
	double height;
	boolean losingHairs;
	
	void study() {
		if (name.equals("Anna")) {
			System.out.println("I study hard");
		}else if (name.equals("roman")) {
			System.out.println(" i will delete the massages");
		}else {
			System.out.println(("i try to study but things dont make such sense"));
		}
	}
	public static void main (String[] args) {
		Person person1=new Person();
		person1.name="yusuf";/// if we use the names anna and roman we get the conditions as well
		person1.study();
		System.out.println("*********************");
		Person person2=new Person();
		person2.name="ahamd";
		person2.study();
	}

}
