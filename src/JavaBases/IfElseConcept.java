package JavaBases;

public class IfElseConcept
{	
	public static void main(String[] args)
	{
		
		int a=30;
		int b=40;
		
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else{
			System.out.println("b is greater than a");
		}
		
		//comparison operators:
		// < > <= >= == !=
		
		int c=20;
		int d=20;
		if(c==d) {
			System.out.println("a and b are equal");
		}else {
			System.out.println("a and b are not equal");
		}
		
		//write a logic to find out highest number
		
		int x=700;
		int y=900;
		int z=800;
		
		//nested if-else condition
		
		if(x>y & x>z) {
		System.out.println("x is the highest");
		}
		else if(y>z)
		{
			System.out.println("y is the highest");
		}
		else {
			System.out.println("z is the highest");
		}
	}
}