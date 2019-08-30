package OOPsConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
	
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum("Test");
		obj.sum(5, 10);
		}
     //We cannot create a method inside a method
	//duplicate method-same method name with same number of arguments(same data types) are not allowed
	//Method overloading-A class contain more than one method with the same name 
	
	
	public void sum() {  //0 input parameter
		System.out.println("This is a method with zero parameters");
	}
	
	public void sum(int i) { // 1 input parameter(integer)
		System.out.println(i);
		System.out.println("This is a method with one input parameters");
	}

	public void sum(String s) {// 1 input parameter(String)
		System.out.println(s);
		System.out.println("This ia a method with one input parameter and string data type");
		
	}
	
	public void sum(int i,int j) { //2 input parameter
		System.out.println(i+j);
		System.out.println("this is a method with two input parameter");
	}
	
	
	public static void main(int p) {  //we can overload main method also
		
	}
	
    public static void main(String p) {
		
	}
}
