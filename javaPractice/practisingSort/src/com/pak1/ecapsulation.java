package com.pak1;

 class ecapsulation {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    enca1 e=new enca1(5,"Siddhu");
    e.methodm1();
    e.methodm2();
    out a=new out(3,"sagar");
    a.methodm1();
    a.m1();
    a.methodm1();
   
    int num=5;
    num=num>>3;
    		System.out.println(-6>>5);
//    		System.out.println(s);

	}

}
class enca1{
	 int a;
	private String s;
	
	public void SetA(int a) {
		this.a=a;
	}
	public int  getA() {
		return a;
	}
	public void SetS(String s) {
		this.s=s;
	}
	public String  getS() {
		return s;
	}
	
	public enca1(int a,String s) {
		this.a=a;
		this.s=s;
	}

	
	public void methodm1() {
		System.out.println(a+" "+s);
	}
	public void methodm2() {
		
		System.out.println(a+" "+s);
	}
	
}
class out extends enca1{
	public out(int a,String s) {
		super(a,s);
	}
	
	public void m1() {
//		SetA(60);
		a=50;
		System.out.println(a);
	}
	public static void main(String []args) {
		ecapsulation e=new ecapsulation();
		e.main(args);
		e.main(args);

	}
	
}
