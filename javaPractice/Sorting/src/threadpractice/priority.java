package threadpractice;

public class priority extends Thread {
 public void run() {
	 for(int i=0;i<5;i++)
		 System.out.println("child");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		priority p=new priority();
		p.start();
		p.currentThread().setPriority(10);
		 for(int i=0;i<5;i++)
			 System.out.println("parent");

	}

}
