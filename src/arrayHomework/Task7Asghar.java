package arrayHomework;

public class Task7Asghar {

	public static void main(String[] args) {
//		7. Write a java program to check whether a given
//		number is prime or not?
        int num = 9;
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        if(isPrime) {
            System.out.println(num+" is Prime");
        }else {

            System.out.println(num+" is not Prime");
        }

    }

	}

