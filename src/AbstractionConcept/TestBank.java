package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HdfcBank b=new HdfcBank();
		b.creditCard();
		b.debitCard();
		b.loan();
		b.intrestRate();

		
		Bank b1=new HdfcBank();
		b1.creditCard();
		b1.debitCard();
		b1.loan();
		
	}

}
