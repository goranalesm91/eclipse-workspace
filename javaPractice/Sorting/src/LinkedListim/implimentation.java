package LinkedListim;
class node{
	int data;
	node next;
public node() {
		
	}
	public  node(int data) {
		this.data=data;
	}
}
public class implimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     node head =new node(6);
      
     node n1=new node(8);
     head.next=n1;
     
     node n2=new node(17);
     n1.next=n2;
 System.out.println(n1.next.data);
System.out.println(n1+" " +n1.next+n2+head+" last"+ n2.next);
	}

}
