package com.String;

public class caseses {

	public static void main(String[] args) {

		fin f=new fin1();
		f.m1();
		f.me();

	}

}
abstract class fin{
	private int num1;
	int num2;
//	fin(int num1,int num2){
//		this.num1=num1;
//		this.num2=num2;
//	}
 abstract	void m1() ;
  void me() {
	  System.out.println("marker");
  }
  
}
class fin1 extends fin{
	fin1(int n,int m){
//		super(n,m);
	}
	int n2=num2;
	void m1() {
		System.out.println("final");
	}
}