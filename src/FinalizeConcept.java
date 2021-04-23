
public class FinalizeConcept {

	public static void main(String[] args) {
	
		FinalizeConcept f1 = new FinalizeConcept();
		f1 = null;
		
		System.out.println("Before gc");
		System.gc();
		System.out.println("After gc");
				
		

	}
	
	@Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    } 

}
