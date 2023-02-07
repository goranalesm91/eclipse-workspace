package threadpractice;
class myth extends Thread{
	public void run() {
		
	}
}
public class newthread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        myth t=new myth();
        System.out.println(Thread.currentThread().getPriority());

        t.currentThread().getPriority();
        System.out.println(t.currentThread().getPriority());

        t.currentThread().setPriority(4);
        System.out.println(t.currentThread().getPriority());

	}

}
