package arrayHomework;

public class Task5 {

	public static void main(String[] args) {
//		5. Create a 2D array of integers. Develop a program
//		which will calculate the sum of even and odd numbers
//		for that array.

		int [][] numbers = { 
				{2,4,5,6,7},
				{3,5,6,7,8}
				};
		int even=0;
		int odd=0;
		
		for(int [] i:numbers) {
			
			
			for(int j:i) {
				if(j%2==0) {
				even+=j;
				
				}else {
				odd+=j;
				}
			
			}
			
	}
		System.out.println(even+" total even");
		System.out.println(odd+" total odd");
	}
}
