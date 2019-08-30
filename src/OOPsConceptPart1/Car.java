package OOPsConceptPart1;

public class Car {
	
	//class-is a logical entity (a class is collection of variables and methods)
	//object-is a physical entity (is an instance of class)
	//method-is a part of class (a piece of code which will perform certain task)
	
	//Declaration:
	//	class Car
	//	{
	//	variables
	//	methods
	//	}

	
	//Class variables
	int mod;
	int wheels;
	
	public static void main(String[] args) {
		
		//new Car()---This is the object of the class
		//new keyword is used to create the object
		//a,b,c--Object reference of the variables
		//Car--->class name
		//Car()---->instantiation
		
		
		Car a=new Car();
		Car b= new Car();
		Car c=new Car();
		
		a.mod=2012;
		a.wheels=4;
		
		b.mod=2015;
		b.wheels=3;
		
		c.mod=2019;
		c.wheels=4;
		
		System.out.println(a.mod); //2012
		System.out.println(a.wheels); //4
		
		System.out.println(b.mod); //2015
		System.out.println(b.wheels); //3
		
		System.out.println(c.mod); //2019
		System.out.println(c.wheels); //4
		
		//Shifting of References
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);//10
		
		c.mod=20;
		System.out.println(a.mod);//20
		System.out.println(c.mod);//20
	}
	
}
