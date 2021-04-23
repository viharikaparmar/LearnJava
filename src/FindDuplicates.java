import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String s1 = "Spider man Bat Man Iron man";
		
		//Step 1: convert to lower case
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		
		//Step 2: split into words
		String a[] = s2.split(" ");
		
		
		//Step 3: Put the words in map as map does not allow duplicate keys
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		for(String i:a) {
			System.out.println(i);
			if(m1.containsKey(i))
				m1.put(i, m1.get(i)+1);
			else
				m1.put(i,1);
		}
		
		System.out.println(m1);
		
		//convert map into set and iterate through set entry
		
		for(Map.Entry<String, Integer> e1:m1.entrySet()) {
			if(e1.getValue()>1)
				System.out.println("Duplicate word is " + e1.getKey());
			
		}
		
		
			
		

	}

}
