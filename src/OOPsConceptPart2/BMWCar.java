package OOPsConceptPart2;

public class BMWCar extends Car { //"has a relationship"
	
	// when method is present in parent class as well as in child class with the same name and same number of arguments ,
	//is called method Overriding
	
	public void start() {//Overridden method
		System.out.println("BMW---Start BMW Car");
	}
	
	public void theftSafety() {
		System.out.println("BMW---Theft Safety");
	}

}
