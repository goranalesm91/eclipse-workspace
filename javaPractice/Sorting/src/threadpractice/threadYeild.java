package threadpractice;
 class th1 extends Thread {
	 public void run() {
		 for(int i=0;i<3;i++) {
			 System .out.println(" child");
			 Thread.yield();
		 }
	 }
 }
public class threadYeild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		th1 t=new  th1();
		t.start();
  for(int i=0;i<5;i++) {
	  System.out.println("main");
  }
	}

}
