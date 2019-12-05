package SampleQuestions;

public class PalindromeNumber {
	
	
	public static void isPalindromeNumber(int num) {
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t==sum) {
			System.out.println(t+" : is a palindrome number");
		}
		else {
			System.out.println(t+" : is not a palindrome number");
		}
		
	}
	
public static boolean isPalindrome(int num) {
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t==sum) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public static void printPalindromeNumber(int num) {
		for(int i=0;i<=num;i++) {
			if(isPalindrome(i)) {
				System.out.println(i+ " ");
			}
		}
	}

	public static void main(String[] args) {

		isPalindromeNumber(151);
		
		printPalindromeNumber(1000);
	}
	

}
