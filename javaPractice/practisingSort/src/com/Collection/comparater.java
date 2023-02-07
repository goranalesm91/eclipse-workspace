package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class comparater implements Comparable<comparater>  {
	int roll;
	int age;
	String name;
	public comparater(int roll,String name,int age) {
		this.age=age;
		this.name=name;
		this.roll=roll;
	}
	public int compareTo(comparater c) {
		return c.name.compareTo(name);
	}

	public static void main(String[] args) {
		ArrayList<comparater> al=new ArrayList<>();
		comparater c1=new comparater(3,"a",15);
		comparater c2=new comparater(7,"b",13);
		comparater c3=new comparater(1,"a",17);
		comparater c4 =new comparater(5,"d",12);
		al.add(c4);
		al.add(c3);
		al.add(c1);
		al.add(c2);
		Collections.sort(al);
		for(comparater c:al) {
			System.out.println(c.roll+" "+c.name+" "+c.age);
		}
		
	}

}
