package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[]=new int[3];//static array---size is fixed
		
		//dynamic array--ArrayList
		//1.can contain duplicate values/elements
		//2.maintains insertion order
		//4.allows random access to fetch the element because it stores the values on the basis of indexes
		
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size()); //3
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		System.out.println(ar.size()); //size of arraylist
		
		//Print a specific value
		System.out.println(ar.get(3));//To get the value from an index
		
		//Print all values from arraylist
		//1.use for loop
		//2.Using iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//for each loop
		for(Object j:ar) {
			System.out.println(j);
		}
		
		//non generic vs generic
		//restrict the array list with data types
		ArrayList<Integer> iarr=new ArrayList<Integer>();
		iarr.add(10);
		
		ArrayList<String> sarr=new ArrayList<String>();
		sarr.add("tom");
		
		System.out.println("***************************");
		//Employee class objects
		Employee emp1=new Employee("John",28,"QA");
		Employee emp2=new Employee("Ram",29,"Dev");
		Employee emp3=new Employee("Sam",30,"Admin");
		//Create arraylist
		ArrayList<Employee> arr1=new ArrayList<Employee>();
		arr1.add(emp1);
		arr1.add(emp2);
		arr1.add(emp3);
		
		//Iterator to traverse the values
		Iterator<Employee> it=arr1.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.age);
			System.out.println(emp.name);
			System.out.println(emp.department);
		}
		
		System.out.println("******Add All******");
		//AddAll
		
		ArrayList<String> sarr1=new ArrayList<String>();
		sarr1.add("tom");
		sarr1.add("Test");
		sarr1.add("Rest");
		
		ArrayList<String> sarr2=new ArrayList<String>();
		sarr2.add("tom");
		sarr2.add("Test1");
		sarr2.add("Rest1");
		
		sarr1.addAll(sarr2);
		for(Object i:sarr1)
		{
			System.out.println(i);
		}
			
		System.out.println("*********Remove All*********");
		
		sarr1.removeAll(sarr2);
		for(Object i:sarr1) {
			System.out.println(i);
		}
		
		System.out.println("**********Retain All******************");
		ArrayList<String> sarr3=new ArrayList<String>();
		sarr3.add("tom");
		sarr3.add("Test");
		sarr3.add("Rest");
		
		ArrayList<String> sarr4=new ArrayList<String>();
		sarr4.add("tom");
		sarr4.add("Test1");
		sarr4.add("Rest1");
		
		sarr3.retainAll(sarr4);
		for(Object i1:sarr3) {
			System.out.println(i1);
		}
	}

}
