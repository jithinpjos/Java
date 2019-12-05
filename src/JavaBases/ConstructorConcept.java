package JavaBases;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("This is default constructor");
	}
	
    public ConstructorConcept(int i) {
	System.out.println("This is constructor with one parameter i "+i);
		
	}
    
    public ConstructorConcept(int i,int j) {
    	System.out.println("This is a constructor with two parameters i is "+i+" and J is "+j);
    }
	
	public static void main(String[] args) {
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);

	}

}
