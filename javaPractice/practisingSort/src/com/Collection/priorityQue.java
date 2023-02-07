package com.Collection;

import java.util.PriorityQueue;

public class priorityQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
   pq.add(20);
   pq.add(40);
   pq.add(10);
   pq.add(34);
   System.out.println(pq);
  System.out.println(pq.contains(10));
	}

}
