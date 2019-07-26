package interviewPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev =0;
		
		while(num!=0) {
			
			rev = (rev * 10) + (num%10);
			num=num/10;
		}

		System.out.println(rev);
		String s = "rains has started";
		System.out.println(s.indexOf("s"));
		int s1 = s.indexOf("s");
		System.out.println(s.indexOf("s",s1+1));
		int s2 = (s.indexOf("s",s1+1));
		System.out.println(s.indexOf("s",s2+1));
		
		
	}

}
