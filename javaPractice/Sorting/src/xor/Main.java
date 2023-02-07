package xor;
//
public class Main {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p1=new parent();
		child c1=new child();
		c1.m1();

	}

}
class parent {
	public void m1() {
		System.out.print("m1");
	}
	
}
class child extends parent{
	
	
}