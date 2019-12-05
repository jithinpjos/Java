package SampleQuestions;


public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		else {
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		return true;
		}
	}
	
	public static void printPrimeNumbers(int num)
	{
		for(int i=0;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("0 is prime :"+isPrimeNumber(0));
		System.out.println("1 is prime :"+isPrimeNumber(1));
		System.out.println("2 is prime :"+isPrimeNumber(2));
		System.out.println("3 is prime :"+isPrimeNumber(3));
		System.out.println("4 is prime :"+isPrimeNumber(4));
		System.out.println("5 is prime :"+isPrimeNumber(5));
		System.out.println("6 is prime :"+isPrimeNumber(6));
		System.out.println("7 is prime :"+isPrimeNumber(7));
		printPrimeNumbers(30);

	}

}
