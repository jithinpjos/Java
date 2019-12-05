package SampleQuestions;

public class ArmstrongNumber {
	
	//153
	//3*3*3=27
	//5*5*5=125
	//1*1*1=1
	//27+125+1=153
	
	
	public static void isArmstrongNumber(int num) {
		int r=0;
		int cube=0;
		int t;
		
		t=num;
		while(num>0) {
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		
		if(t==cube) {
			System.out.println(t+" is an armstrong number");
		}
		else
		{
			System.out.println(t+" is not an armstrong number");
		}
	}

	public static boolean isArmstrong(int num) {
		int r=0;
		int cube=0;
		int t;
		
		t=num;
		while(num>0) {
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		
		if(t==cube) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void printArmstrong(int num)
	{
		for(int i=0;i<=num;i++) {
			if(isArmstrong(i)) {
				System.out.print(i+ " ");
			}
		}
	}
	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(152);
		
		printArmstrong(1000);

	}

}
