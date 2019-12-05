package OOPsConceptPart2;

public class HSBCBank implements USBank,BrazilBank{//we are achieving multiple inheritance
	//is a relationship

	//if a class is implementing interface ,then it is mandatory to define/override all the methods of interface
	//overriding from USBank
	public void credit() {
		System.out.println("HSBCBank----credit");
	}
	public void debit() {
		System.out.println("HSBCBank----debit");
	}
	public void transferMoney() {
		System.out.println("HSBCBank-----transferMoney");
	}
	
	//seperate method of HSBCBank class
	public void educationLoan() {
		System.out.println("HSBCBank----eductionLoan");
	}
	public void carLoan() {
		System.out.println("HSBCBank----carLoan");
	}
	
	//brazil bank method:Override from brazil bank
	public void mutualFund() {
		System.out.println("HSBCBank---mutual fund");
	}
}
