package threadpractice;
class ts extends Thread{
	static Thread mt;
	public void run() {
		try {mt.join(50);
	}catch(InterruptedException e) {}
		for(int i=0;i<5;i++){
			System.out.println("Goranale");
			
			}
		
	}
}
public class waitingChildthreadUntilComplingMainTHRAD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ts.mt =Thread.currentThread();
ts t=new ts();
t.start();
 for(int i=0;i<5;i++) {
	 t.join(100);
	 System.out.println("Siddharam");
	 Thread.sleep(300);
 }
	}

}
