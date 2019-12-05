package AbstractionConcept;

public abstract class Bank {
	
	//Partial abstraction
	//hiding the implementation logic --is called abstraction
	//abs class has abs methods and non abs methods
	//cannot create the object of abs class
	
	int amount=10;
	final int rate=10;
	static int rateLoan=20;
	
	
	public abstract void loan(); //abstract method--no method body
	
	
	//Non abstract methods
	public void creditCard() {
		System.out.println("Bank class---Credit card");
	}
	
	public void debitCard() {
		System.out.println("Bank class---Debit card");
	}

}
