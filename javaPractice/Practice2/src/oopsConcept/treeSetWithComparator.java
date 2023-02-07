package oopsConcept;

import java.util.*;
import java.util.TreeSet;

public class treeSetWithComparator {

	public static void main(String ar[]) {
		TreeSet<String> t=new TreeSet(new myComparator());
		
//		t.add(10);
//		t.add(5);
//		t.add(9);
//		t.add(11);
		
		t.add("siddhu");
		t.add("sachin");
		t.add("ajay");
		t.add("mantu");
		System.out.println(t);
	}
}
class myComparator implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		String l1=(String)obj1;
		String l2=(String)obj2;
//		if(l1<l2) return +1;
//		else if(l1>l2) return -1;
//		else return 0;
		return l1.compareTo(l2);
		
	}
	
}

