package shoping1;

import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Stack;
import java.util.TreeSet;

public class order {
 public static void main(String []agr) {
 Scanner sc=new Scanner(System.in);
// Stack<Integer>st=new Stack<>();
// int n=5;
// for(int i=0;i<5;i++) {
//	 st.push(sc.nextInt());
// }
// System.out.println(st);
// System.out.println(st.pop());
// System.out.println(st.search(5)+"idex");
// System.out.println(st.empty());
	 int ar[]=new int [6];
	 for(int i=0;i<6;i++) {
		 ar[i]=sc.nextInt();
	 }
 TreeSet<Integer> ts=new TreeSet<>();
 for(int i=0;i<6;i++) {
	 ar[i]*=ar[1];
	 ts.add(ar[i]);
 }
// for (Integer value : ts)
// {
//	    System.out.print(value+ "  ");
//	}
 System.out.println(ts);
 }
}
