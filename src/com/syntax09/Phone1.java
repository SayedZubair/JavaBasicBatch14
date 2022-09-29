package com.syntax09;

public class Phone1 {

//@hereCreate a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes
//and behaviors.
 String model;
 String color;
 String name;    ////this part is the attribute of the phone
 double size;
 int storage;
 
 
 // the following part is defining the behaviours or the function 
 void call (){
	 System.out.println("calling "+name);
	 
 }
 void takingPhoto() {
	 System.out.println("taking photo with good quality");
 }
 
 // we can have the following part in another class too as phone tester
 
// public static void main(String[] args) {
//	 Phone1 iphone=new Phone1();
//	 
//	 iphone.model= "promax";
//	 iphone.color="white";
//	 iphone.size=6.7;
//	 iphone.storage=128;
//	 System.out.println("make "+iphone.model+" "+iphone.color+" color");
//	 iphone.takingPhoto();
//	 
//	 
//	 Phone1 sumsung=new Phone1();
//	 
//	 sumsung.model ="ultra";
//	 sumsung.size=4.5;
//	 sumsung.storage=256;
//	 System.out.println(sumsung.model+" has only "+sumsung.storage+" GB");
//	 sumsung.call();
//	 
	 
 //}
}
