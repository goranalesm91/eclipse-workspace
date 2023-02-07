package thread;
import java.lang.*;
class myThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("myThread");
	}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
myThread m=new myThread();

m.start();

for(int i=0;i<10;i++) {
	System.out.println("main thread");
}
	}

}
