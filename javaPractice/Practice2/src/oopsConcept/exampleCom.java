package oopsConcept;
import java.util.*;

public class exampleCom {
 public static void main(String []ar) {
	 Set<Employ> t=new TreeSet<>();
	 Employ e1=new Employ(1,"sachin","ajay");
	 Employ e2=new Employ(4,"sachin","ajay");

	 Employ e3=new Employ(2,"sachin","ajay");
	 Employ e4=new Employ(3,"sachin","ajay");
t.add(e4);
t.add(e3);
t.add(e2);
t.add(e1);

	 for(Employ e:t) {
		 System.out.println(e.id+"   "+e.city+"  "+e.name);
	 }
//	 System.out.println(t.toString());
 }
}
class Employ implements Comparable<Employ>{
	int id;
	String name,city;
	
	public Employ(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int compareTo(Employ e) {
		if(e.id>id) return 1;
		else if(e.id<id) return -1;
		else return 0;
	}
	public String toString() {
		return id+"   "+city+"  "+name;
	}
}