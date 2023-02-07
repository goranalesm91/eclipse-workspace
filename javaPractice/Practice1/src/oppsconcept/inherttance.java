package oppsconcept;
class main{
	
	int a;
	int  b;
	main(){
	
	}
	public main(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void paret() {
		System.out.println("parent");
		System.out.println(a+" "+b);
	}
}
class main1 extends main{
	
	int a;
	int b;
	int c;
//	System.out.println("parent");
	public void child() {
		System.out.println("child");
	}

}

public class inherttance {

	public static void main(String[] args) {
  main m1=new main(5,3);
  main1 m2=new main1();
//  main1 m3=new main();
  
  m1.paret();
  m2.child();
//  m3.paret();
  
	}

}
