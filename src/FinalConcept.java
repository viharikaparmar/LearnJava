
public class FinalConcept {
	
	final static int f = 11;

	public static void main(String[] args) {
		
		final int c1 = 10;
		
		
		System.out.println("*****parent class reference pointing to parent class obeject*****");
		parentClass p1 = new parentClass();
				
		p1.overridemethod();
		p1.nooverridemethod();
		
		System.out.println("*****parent class reference pointing to child class obeject*****");
		parentClass p2 = new childClass();
		
		p2.overridemethod();
		p2.nooverridemethod();
		
	
		System.out.println("*****child class reference pointing to child class obeject*****");	
		childClass c2 = new childClass();
		
		c2.overridemethod();
		c2.childclassmethod();
		

	}

}
