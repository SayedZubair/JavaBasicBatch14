package com.syntax09;

public class Dog {
	// state or we can call the following items attributes properties or fields
	
	String name;
	String color;
	String breed;
	double weight;
	int    age;
	
	
	// the following part is defining the behaviour part which shows the behaviour of the dog
   // behaviour / methods or functions 
	
	void bark() {
		System.out.println("barking...........");
	}
	void sleep() {
		System.out.println("dog is sleeping........");
	}
	public static void main(String[]args) {
	// creating objects form the class 	
	// new dog ();=-> it creates an object of class dog
		Dog dog1=new Dog();
		// calling a behaviour on an object
		dog1.bark();
		dog1.sleep();
	}

}
