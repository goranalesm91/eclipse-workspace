package LinkedListim;

import java.util.HashMap;
import java.util.Map;

public class map1 {
public static void main(String args[]) {
	HashMap<Integer,Integer> mp=new HashMap<>();
	mp.put(2,5);
	mp.put(5, 6);
	mp.put(3,7);
	for(Map.Entry<Integer,Integer> m:mp.entrySet()){
        System.out.println(m.getKey()+"   "+m.getValue());
    }}
}
