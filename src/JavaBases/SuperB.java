package JavaBases;

public class SuperB extends SuperA {
	
	public SuperB() {
		super();
		System.out.println("This is child class default constructor");
	}
	
	public SuperB(int i) {
		super(i);
		System.out.println("This is child class default constructor");
	}
	
	public SuperB(int i,int j) {
		super(i,j);
		System.out.println("This is child class default constructor");
	}

	public static void main(String[] args) {
		SuperB obj=new SuperB();
		SuperB obj1=new SuperB(10);
		SuperB obj2=new SuperB(10,20);
	}

}
