package QueuePractice;

import java.util.*;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Object> num = new ArrayDeque<Object>();
		Queue<Integer> num = new PriorityQueue<Integer>();

		num.add(10);
		num.add(20);
		num.offer(30);
		num.offer(49);
		num.add(35);
//		num.add(num);
//		num.add("javaa");
		//System.out.println(num);
		
		
		
		Iterator<Integer> iter = num.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+"  ");
		}
		System.out.println(num.size());
		while(num.peek()!=null) {
			System.out.println(num.poll());
		}
		
//		 Iterator<Integer> iterate = num.iterator();
//	        while(iterate.hasNext()) {
//	            System.out.print(iterate.next());
//	            System.out.print(", ");
//	        }

	}

}
