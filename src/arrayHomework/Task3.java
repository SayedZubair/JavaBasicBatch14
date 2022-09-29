package arrayHomework;

public class Task3 {

	public static void main(String[] args) {
//		3. Create a 2D array of integer values. Print the sum of
//		all numbers.
		int [][] numbers = { 
				{2,4,5,6,7},
				{3,5,6,7,8}
				};
		int total=0;
		for(int [] i:numbers) {
			for(int j:i) {
			
				total+=j;
			}
			
		}
System.out.println(total);
	}

}
