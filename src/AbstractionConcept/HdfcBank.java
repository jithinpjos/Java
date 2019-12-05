package AbstractionConcept;

public class HdfcBank extends Bank {

	@Override
	public void loan() {
		System.out.println("HdfcBank---loan");
		
	}
	
	public void intrestRate() {
		System.out.println("HdfcBank---IntrestRate");
	}
	

}
