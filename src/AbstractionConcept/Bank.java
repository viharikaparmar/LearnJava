package AbstractionConcept;

public abstract class Bank {
	
	static int rot =10;
	
	 
	public abstract void loan();
	
	public void credit() {
		int rot=0;
		System.out.println("Credit");
		System.out.println(Bank.rot);
		//rot=90;
		System.out.println(rot);
	}
	
	public void debit() {
		System.out.println("Debit");
	}	
	
}
