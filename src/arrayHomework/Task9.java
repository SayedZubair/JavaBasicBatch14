package arrayHomework;

public class Task9 {

	public static void main(String[] args) {
		// 9. Maximum and minimum number in the array?
		int [] num={23,33,22,11,22,34,2,3,5,};
		
		int max=0;/// for max we always leave 0 ;;
		int min=num[0];///// we cant assign zero to min as 0 is already a min number, therefore we need to go 
		// for another for each. this zero the first index of the row 
		for(int num1:num) {
			
			if(num1>max) {
				 max=num1;
				 
				   /// both if conditions are being ran each loop
			}
			if(num1<min) {
				min=num1;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}

}
