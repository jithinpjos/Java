package OOPsConceptPart1;

public class LocalVsGlobalVariable {

	//Global variable--class variables
    String name="John";
	int age=30;
	
	public static void main(String[] args) {
		int i=10;//local variable for main method
		System.out.println(i);//10
		
		
		
		LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	
	public void sum() {
		int i=15; //local variable for sum method
		int j=20;	
		String n=name;
	}
}
