package com.syntax09;

public class Phone {
String make;
String model;
String color;
int storage;
double size;
boolean cheap;


	void call() {
	System.out.println("calling......");
}
	void takePicture() {
	System.out.println("taking picture");
}
	public static void main(String[]args){
	// name of class variable name = new name of class();
		
		Phone iphone=new Phone();
		iphone.make="apple";
		iphone.model="Iphone14";
		iphone.color="black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		System.out.println("make"+iphone.make+" model "+iphone.model);
		iphone.call();
		
		System.out.println("******************************************");
		
		Phone 		samsungPhone =new Phone();
		
		samsungPhone.make="samsung";
		samsungPhone.model= "S2 ultra";
		samsungPhone.color="gray";
		samsungPhone.storage=256;
		samsungPhone.size=6.7;
		samsungPhone.cheap=false;
        System.out.println(iphone.make);
		System.out.println(samsungPhone.make);
		samsungPhone.call();
		
		
		
	}	
}
