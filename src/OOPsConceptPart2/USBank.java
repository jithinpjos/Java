package OOPsConceptPart2;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Only Method declaration
	//no method body-only method prototype
	//In Interface we can declare the variables,vars are by default static in nature
	//vars value will not be changed
	//no static method in interface
	//no main method in interface
	//we can  not create the object of interface
	//Interface is abstract in nature

}
