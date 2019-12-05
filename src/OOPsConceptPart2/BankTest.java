package OOPsConceptPart2;

public class BankTest {

	public static void main(String[] args) {
		//static polymorphism
		HSBCBank hsbc=new HSBCBank(); 
		hsbc.credit();
		hsbc.debit();
		hsbc.transferMoney();
		hsbc.educationLoan();
		hsbc.carLoan();
		
		//dynamic polymorphism
		//child class object can be referred with interface reference var
		USBank usbank=new HSBCBank(); 
		usbank.credit();
		usbank.debit();
		usbank.transferMoney();
		
	}

}
