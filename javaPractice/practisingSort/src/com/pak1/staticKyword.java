package com.pak1;

public class staticKyword {
 static int a=10;
 int b;
 static void  method1() {
	 System.out.println("static method");
 }
  public staticKyword(){
	 System.out.println("constructor");
  }
  int method(int a) {
	  return 1;
  }
   void method() {
	 System.out.println(b);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		staticKyword.method1();
//		staticKyword s=new staticKyword();
//	/	s.method();
		student s1=new student(12,"siddhu","gora");
		s1.one();
		student s2=new student(24,"pintu");
		s2.one();
		child ch=new child();
		 ch.method1();
	}

}
class student{
	int age;
	String name;
	String lName;
	public student(int age,String name,String lname) {
		this.age=age;
		this.name=name;
		this.lName=lname;
	}
	public student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	void one() {
		System.out.println(age+ " "+name+"  "+lName );
	}
}
interface intrf{
	public void method1();
}
abstract class abs2 implements intrf{
	abstract public void method1();
}
class child extends abs2 {
	public void method1() {
		System.out.print("child");
	}
}
