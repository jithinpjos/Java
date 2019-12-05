package JavaBases;

public class ConstructorWithThisKeyword {
	
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name,int age) {
		
		this.name=name;
		this.age=age;
		
		
	}
	
	public  void printName() {
		System.out.println(name);
		System.out.println(age);

	}


	public static void main(String[] args) {
		ConstructorWithThisKeyword obj=new ConstructorWithThisKeyword("john", 21);
		obj.printName();

	}

}
