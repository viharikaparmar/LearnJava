package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {

		String org = "Spider man Bat man Spider man";
		String o1 = org.toLowerCase();
		System.out.println(o1);
		
		String[] orgarr = o1.split(" ");
		System.out.println(orgarr);
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		for(String s:orgarr){
			System.out.println(s);
			if(m.containsKey(s)) {
				m.put(s, m.get(s)+1);
			}
			else {
				m.put(s,1);
			}				
			
		}
		
		System.out.println(m);
		
		for(Map.Entry<String,Integer> e1:m.entrySet()) {
			if(e1.getValue()>1) {
				System.out.println("Duplicate word is " + e1.getKey());
				
			}
		}
		
		

	}

}
