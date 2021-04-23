package AbstractionConcept;

public class TestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new CosmosBank();
		b1.credit();
		b1.debit();
		b1.loan();
		
		
		CosmosBank b2 = new CosmosBank();
		b2.credit();
		b2.debit();
		b2.loan();
		b2.fd();
		
		

	}

}
