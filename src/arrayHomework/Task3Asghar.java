package arrayHomework;

public class Task3Asghar {

	public static void main(String[] args) {
//		3. Create a 2D array of integer values. Print the sum of
//		all numbers.
		int[][]arr= {
				{10,10,20,40,},
				{25,30,50},
				{20,30}
				
		};
		
		int sum=0;
		for(int[]ar:arr) {
			
	
			for(int num:ar) {
				sum+=num;
			}
		}
		System.out.println(sum);
	}

}
