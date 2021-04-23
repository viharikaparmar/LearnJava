package interviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {

		String org = "Spider man Bat man Spider man";
		String o1 = org.toLowerCase();
		System.out.println(o1);
		
		String[] orgarr = o1.split(" ");
		//System.out.println(orgarr);
		
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
		
		//convert map into set with each set value = key value pair
		Set s1 = m.entrySet();
		
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext()){
			Map.Entry m1 = (Map.Entry)i1.next();
			System.out.println("key = " + m1.getKey());
			System.out.println("Value = " + m1.getValue());
		}
		
		for(Map.Entry<String,Integer> e1:m.entrySet()) {
			if(e1.getValue()>1) {
				System.out.println("Duplicate word is " + e1.getKey());
				
			}
		}
		
		m.put("", 5);
		System.out.println(m);
		m.put("", 6);
		m.put("", 7);//this will be displayed - allows only one null key
		m.put("hh",null);
		m.put("hh", 9);
		m.put("yy",null); //allows multiple null values
		m.put("bat", 7);
		System.out.println(m);;
		

	}

}
