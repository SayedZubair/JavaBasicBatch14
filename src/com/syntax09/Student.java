package com.syntax09;

public class Student {

	
	String name;
	String id;
	int age;
	int wieght;
	char gender;
	
	// each behaviour should be independent not inside each other 
	void  study() {
		System.out.println("student is studying");
		
	}
	void deleteMassages() {
		System.out.println("deleting message from discord");
	}
	void eat() {
		System.out.println("eating pizzaaaaaa");
		
	}
	public static void main (String []args) {
		
		Student theObjectName=new Student();
		theObjectName.name= "Sayed";
		theObjectName.id="123";
		theObjectName.age=22;
		
		
		System.out.println(theObjectName.name);
		System.out.println(theObjectName.age);
		theObjectName.deleteMassages();
		theObjectName.deleteMassages();
		
		Student student2=new Student();
		student2.name="Asma";
		student2.age=16;
		student2.wieght=30;
		student2.gender='f';
		System.out.println(student2.name);
		student2.eat();
	}
}
