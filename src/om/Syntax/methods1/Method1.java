package om.Syntax.methods1;

public class Method1 {
	
	
	
	public static int sum (int a, int b) {
		
		int total=a+b;
		return total;
		
	}
	
	public static void main(String[] args) {
			int total3= sum(12,12);
		System.out.println(total3);
		
		System.out.println(sum(12,45));
		
		System.out.println(welcome("Sayed "));
	}
public static String welcome(String name) {
	String a = "welcome to my program Mr "+name;
	return a;
}
	
}
