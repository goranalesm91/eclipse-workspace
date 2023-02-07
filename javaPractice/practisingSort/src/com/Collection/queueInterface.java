package com.Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue<Integer> que=new LinkedList();
   que.add(30);
   que.add(45);
   que.add(60);
   System.out.println(que);
//   que.remove();
   System.out.println(que.poll());
   System.out.println(que.peek());
   System.out.println(que.size());
	}

}
