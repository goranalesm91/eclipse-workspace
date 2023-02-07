package threadpractice;
class join extends Thread{
	 public void run() {
		 for(int i=0;i<5;i++) {
		 System.out.println("setts");
		 try {Thread.sleep(1000);
		 }catch (InterruptedException e){}
			 
		 }
	 }
}
public class threadJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
join j=new join();
j.start();
j.join(100,10);
for(int i=0;i<5;i++)
System.out.println("ram");



	}

}
