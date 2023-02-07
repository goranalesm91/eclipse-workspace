package com.Collection;
import java.lang.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashSet set=new HashSet();
  set.add(20);
  set.add(45);
  set.add(40);
  set.add(32);
  System.out.println(set);
	
Set s=new LinkedHashSet();
s.add(20);
s.add(45);
s.add(40);
s.add(32);
System.out.println(s);
System.out.println(s);
set.remove(s);
System.out.println();
}
}
