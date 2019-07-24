package interviewPrograms;

public class RemoveSpecialChars {

	public static void main(String[] args) {
	
		String s1 = "Selenium ^!(*&*(@(@))) Java";
		s1 = s1.replaceAll("[^a-zA-Z0-9 &]","");
		
		System.out.println(s1);
			
				

	}

}
