package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Map<String , Integer> map=new HashMap<>();
  map.put("siddhu", 2);
  map.put("sager", 4);
  map.put("pintu", 7);
  System.out.print(map);
  for(int key:map.values()) {
	  System.out.println(key);
  }
 
	}

}
