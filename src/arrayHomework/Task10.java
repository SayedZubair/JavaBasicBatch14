package arrayHomework;

public class Task10 {

	public static void main(String[] args) {
		//		10. Write a java program to find the second largest
		//		number in the array?
		
	 int [] num={23,33,22,11,22,34,2,3,5,};
	 int max=0;
	 int max2=0;
	 for(int num1:num) {
		 if(num1>max) {
			 max=num1;
			 ////////the above for is to fine the max num we need to create two independent for loops 
		 }

	 }
	 for(int num1:num) {
		
		 if(num1>max2 && num1<max) {  // this is for the second max number 
			 						// here max is already 34
			 max2=num1;
		 }
	 }
	 System.out.println(max);// we can delete this part as we need the second largest number 
	 System.out.println(max2);
	}
			// if we need to find the third largest number we need another independent for loop
}
