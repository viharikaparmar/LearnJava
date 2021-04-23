
public class childClass extends parentClass{
	
	public void childclassmethod() {
		System.out.println("childclassmethod - In child class");
		System.out.println(super.c);
	}
		
	@Override
	public void overridemethod() {
		System.out.println("overridemethod - In Child class");
	}


}
