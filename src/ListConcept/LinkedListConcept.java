package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	
	public static void main(String[]args) {
	
	LinkedList<String> ll=new LinkedList<String>();
	
    ll.add("Tom");
    ll.add("Selenium");
    ll.add("RPA");
    ll.add("Security");
    
    System.out.println("LinkedList contents are "+ll);
    
    ll.addFirst("John");
    ll.addLast("Rose");
    
    System.out.println("LinkedList contents are "+ll);
      
    ll.add(2, "selenium1");
    
    System.out.println("Linked List content "+ll);
    
    System.out.println("********************************");
    
    for(int i=0;i<ll.size();i++) {
    	System.out.println(ll.get(i));
    }
    
    System.out.println("***************foreach*************");
    
    for(String str:ll) {
    	System.out.println(str);
    }
    
    System.out.println("***********iterator************");
    Iterator<String> it=ll.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    System.out.println("****************while*****************");
    int num=0;
    while(ll.size()>num) {
    	System.out.println(ll.get(num));
    	num++;
    }
    
	}
}
