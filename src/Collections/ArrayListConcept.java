package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[] args) {

	ArrayList l1 = new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(10);
	
	for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(i));
	}
	
	ArrayList<String> l2 = new ArrayList<String>();
	l2.add("My");
	l2.add("name");
	l2.add("is");
	
	for(int i=0;i<l2.size();i++) {
		System.out.println(l2.get(i));
	}
	
   Employee e1 = new Employee("Viharika", 01, "QA");
   Employee e2 = new Employee("Neha", 02, "Dev");
   Employee e3 = new Employee("Vaibhav", 03, "Admin");
   
   ArrayList<Employee> emplist = new ArrayList<Employee>();
   emplist.add(e1);
   emplist.add(e2);
   emplist.add(e3);
   
   Iterator<Employee> empitr = emplist.iterator();
   while(empitr.hasNext()) {
	   Employee e = empitr.next();
	   System.out.println(e.name + e.ID + e.dept);
   }
   
	ArrayList l3 = new ArrayList();
	l3.add(10);
	l3.add(20);
	l3.add(10);
	
	ArrayList l4 = new ArrayList();
	l4.add(10);
	l4.add(40);
	l4.add(50);
	
	l3.addAll(l4);
	System.out.println("***Add**********************");
	for(int i=0;i<l3.size();i++) {
		System.out.println(l3.get(i));
	}
	
	l3.removeAll(l4);
	
	System.out.println("***remove**********************");
	for(int i=0;i<l3.size();i++) {
		System.out.println(l3.get(i));
	}
	
	
	ArrayList l5 = new ArrayList();
	l5.add(10);
	l5.add(20);
	l5.add(30);
	
	ArrayList l6 = new ArrayList();
	l6.add(10);
	l6.add(40);
	l6.add(50);

	l5.retainAll(l6);
	
	System.out.println("***Retain**********************");
	for(int i=0;i<l5.size();i++) {
		System.out.println(l5.get(i));
	}
	
	
	
	
	}
}
