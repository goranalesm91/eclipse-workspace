package thread;
import java.util.*;
class test extends Thread{
	 public void run() {
		System.out.println("my thread");
	}
}
public class threadDemo1 {
	
	public static void majn(String args[]) {
		test t=new test();
//		Thread t1=new Thread(t);
		
			t.start();
				System.out.println("main thread");
	}

}
