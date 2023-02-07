package thread;
import java.lang.*;

class myThread1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("'my runnable'");
		}
		Thread.currentThread().setName("siddharam");

		System.out.println(	Thread.currentThread().getName());

	}
	
}
public class RunnableDemo {

	public static void main(String [] args) {
		myThread1 t1=new myThread1();
		Thread t=new Thread(t1);
		
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("'my main'");
		}
//		Thread.currentThread()
		System.out.println(		Thread.currentThread());
		Thread.currentThread().setName("siddhu");
		System.out.println(Thread.currentThread().getName());

	}
//	static {
//	System.out.println("hellow");
////	System.exit(0);

}
