package arrayHomework;

public class Task6 {

	public static void main(String[] args) {
//		6. Write a program to swap 2 numbers without a
//		temporary variable?
//int x=4;
//int y=10;
//int valueX=x;
//x =y;
//
//y=valueX;
//            the above one the temperary variable holding one value
		
		int x=4;
		int y =6;
		x = x+y;
		y = x-y;
		x = x-y;
		
System.out.println("x ="+x);
System.out.println("y ="+y);

	}

}
