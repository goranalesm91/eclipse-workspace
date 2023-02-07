package sort;

import java.util.Scanner;

//import LinkedListim.Node;
class Node{
	 int data;
	Node next;
	public Node() {
		
	}
	public Node(int data) {
		this.data=data;
	}
}
public class printii {
	public static Node getTail(Node head) {
		Node itr=head;
		while(itr.next!=null) {
			Node nbr=itr.next;
			itr=nbr;
		}
		return itr;
	}
	public static void addAtLast(int val ,Node head) {
		Node  tail=getTail(head);
		
		
		Node nn=new Node(val);
		tail.next=nn;
		tail=nn;
	}
	public static void addfirst(int val ,Node head) {
		Node nn=new Node(val);
		nn.next=head;
		head=nn;
	}
	
public static void print(Node head) {
	System.out.println("output");
	Node itr=head;
	while(itr!=null) {
		
		System.out.println(itr.data+" ");
		Node nbr =itr.next;
		itr=nbr;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       int add_first=sc.nextInt();
       Node head =new Node(add_first);
       Node itr=head;
       for(int i=0;i<n;i++) {
    	   int data=sc.nextInt();
    	   
    	   Node n1=new Node(data);
    	   itr.next=n1;
    	   
    	   Node nbr=itr.next;
    	   itr=nbr;
    	   
    	   
    	   
    	   
       }
       
       
       print(head);
       System.out.println("last");
       addfirst(454,head);
       
       addAtLast(36,head);
       System.out.println("adding new data");
       print(head);
	}

}
