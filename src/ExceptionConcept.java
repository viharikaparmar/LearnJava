
public class ExceptionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionConcept.div();

	}

	public static void div() {
		try {
			System.out.println("Inside try block");
			int result = 5/0;
		}
	catch(NullPointerException e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside Finally");
		}
		System.out.println("Outside try catch");
	}
}
