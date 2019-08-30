package OOPsConceptPart1;

public class MethodsInJava {

	//main method-Starting point of execution
	public static void main(String[] args) {
		
		MethodsInJava obj= new MethodsInJava();
		// one object will be created,obj is the reference variable, referring to the object
		//after creating the object,the copy of all non static method is given to this object
		//main method is void--never return a value
		
		obj.test(); 
		int q=obj.sum();
		System.out.println(q);
		
		String r=obj.con();
		System.out.println(r);
		
		int s=obj.div(30, 10);
		System.out.println(s);
		
	}
	
	//non-static methods

	//void does not return any value
	//return type=void
	public void test() {//no input,no output
		System.out.println("This is a test method");
	}
	
	// return type=int
	public int sum() {//no input,some output
		System.out.println("This is a sum method return integer");
		int a=10;
		int b=20;
		int c =a+b;
		return c;	
	}
	//return type is string
	public String con() { //no input,some output
		System.out.println("This a method return string");
		String s1="Hello";
		String s2="World";
		String s3=s1.concat(s2);
		return s3;
	}
	
	//return type int
	//i,j =input parameters/arguments
	public int div(int i,int j) { //some input,some output
		System.out.println("this is a method accept and return integer");
		int k=i/j;
		return k;
	}
}
