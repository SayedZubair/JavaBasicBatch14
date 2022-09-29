package com.syntax10;

public class StringDemo7 {

	public static void main(String[] args) {
        String str="I am always consfused i was kidding";

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf(" "));

        // str.substring() gives you smaller string from a String we can start the starting 
        //part to this method and it will return us the subString from that index
        System.out.println(str.substring(5));
        // we can also give the starting point and the ending points from the index
        System.out.println(str.substring(5,14));
      

	}

}
