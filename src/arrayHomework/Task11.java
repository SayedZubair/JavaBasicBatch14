package arrayHomework;

public class Task11 {

	public static void main(String[] args) {
			
		//		11. Write a program to print out duplicate elements from
		//		an Array of Strings?
		
		int[] num= {23,45,55,66,66,77,87,23,45};
		
		for(int i =0; i<num.length; i++) {
			int holder=num[i];
			for(int j=i+1; j<num.length; j++ ) { // +1 is to compare the second ahead number with the previous
												// one holding in i
				if(holder==num[j])    /// 
					System.out.println(holder);
			}
		}
		
		
		String names []= {"maqsoud","ahmad","mahmoud","mahoomd","ahmad"};
			
		for (int i =0;i<names.length;i++) {
			
			String holder=names[i];
			for(int j=i+1; j<names.length;j++) {
			 if (holder.equals(names[j])) {
				 System.out.println(holder);
			 }
		    }
		}
			
		
		
	}

}
