package arrayHomework;

public class Task4 {

	public static void main(String[] args) {
//		4. Create a 2D array or integer type where you will store
//		odd and even numbers. Develop a program which will
//		identify/print the even numbers only.
		int [][] numbers = { 
				{2,4,5,6,7},
				{3,5,6,7,8}
				};
		
		for(int [] i:numbers) {
			
			for(int j:i) {
				if(j%2==0) {
					System.out.println(j);
				}
			
			}
			
		}

	}






}
