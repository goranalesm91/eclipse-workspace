package threadpractice;
import java.lang.*;
class testt implements Runnable {
	
	
	
	public void run(){
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName()+"id");

		System.out.println("using runnable");
	}

}
 
public class interface1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testt t1=new testt();
		Thread th= new  Thread(t1);
		th.start();
		testt t2=new testt();
		Thread t3= new  Thread(t2);
		t3.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("siddhu");
		System.out.println(Thread.currentThread());
		System.out.println(t3.getName().length()+"length");

		System.out.println(th.getName());
		System.out.println(Thread.currentThread().getName());


	}

}
