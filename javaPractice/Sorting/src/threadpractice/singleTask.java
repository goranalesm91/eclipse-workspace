package threadpractice;

class test extends Thread{
public void run() {
	System.out.print("task1");
}
}
class test1 extends Thread{
public void run() {
	System.out.print("task2");
}
}
public class singleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.start();

		test1 t1=new test1();
		t1.start();
	}

}
