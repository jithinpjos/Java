package SampleQuestions;

public class FactorialOfNumber {

	//fact(0)=1;
	//fact(1)=1;
	//2=2*1=2
	//3=3*2*1=6
	//4=4*3*2*1=24
	
	//without recursion -using for loop
	public static int factorial(int num) {
		int fact=1;
		if(num==0) {
			return 1;
		}
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	
	//with recursion 
	
	public static int fact(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return(num*fact(num-1));
		}
	}
	
	public static void main(String[] args) {
	
	/*	System.out.println("factorial of 0 : "+factorial(0));
		System.out.println("factorial of 1 : "+factorial(1));
		System.out.println("factorial of 2 : "+factorial(2));
		System.out.println("factorial of 3 : "+factorial(3));
		System.out.println("factorial of 4 : "+factorial(4));
		System.out.println("factorial of 5 : "+factorial(5));
		System.out.println("factorial of 6 : "+factorial(6));
	*/	
		
		System.out.println("factorial of 0 : "+fact(0));
		System.out.println("factorial of 1 : "+fact(1));
		System.out.println("factorial of 2 : "+fact(2));
		System.out.println("factorial of 3 : "+fact(3));
		System.out.println("factorial of 4 : "+fact(4));
		System.out.println("factorial of 5 : "+fact(5));
		System.out.println("factorial of 6 : "+fact(6));

	}

}
