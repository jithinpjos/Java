package OOPsConceptPart1;

public class StaticAndNonStatic {
	//Global variables --the scope of global variables will be available across all the functions with some condition

	 String Name="John";  //Non static global variable
	   static int age=30;  //Static variable
	public static void main(String[] args) {
   
		//How to call static methods and variables
		//1.Direct calling
		add();
		System.out.println(age);
		
		//2.Calling by class name
		StaticAndNonStatic.add();
		System.out.println(StaticAndNonStatic.age);
		
		
		//How to call non static method and variables
		//By creating object
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sum();
		System.out.println(obj.Name);
		
		
		//Can i access static methods by using object reference?yes
		obj.add();//waring will be given
  
	}
	
	public void sum() { //non static method
		System.out.println("This is a non static method");
	}
	
	public static void add() { //Static method
		System.out.println("This is a static method");
	}

}
