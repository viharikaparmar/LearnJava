
public  class parentClass {
	
	int a,b;
	int c = 200;
	
	public void overridemethod() {
		System.out.println("overridemethod - In parent class");
		this.a = 10;
		this.b = 20;
	}
	
	public void nooverridemethod() {
		System.out.println("nooverridemethod - In parent class");
	}

}
