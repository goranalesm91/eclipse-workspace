package oopsConcept;

import java.util.ArrayList;
import java.util.HashMap;

public class inhertance {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList fish= new ArrayList();
		ArrayList Other=new ArrayList();
		al.add("mankey");
		al.add("mankey");

		fish.add("sharck");
		fish.add("sharck");
		
		
		HashMap<String,ArrayList> msp=new HashMap();
          
		
		msp.put("animal", al);
		msp.put("fishes", fish);
		
		System.out.println(msp);
		
	}

}
