package interviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String org = "Selenium";
		String rev = "";
		
		for (int i = org.length()-1;i>=0;i--) {
			rev = rev + org.charAt(i);
		}
		
		System.out.println(rev);
		
				
		//using StringBuffer, Stringbuffer is mutable
		//String is immutable whereas StringBuffer and StringBuider are mutable classes.

		StringBuffer sf = new StringBuffer(org);
		System.out.println(sf.reverse());
		
	}

}
