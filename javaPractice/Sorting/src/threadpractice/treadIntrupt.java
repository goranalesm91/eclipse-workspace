package threadpractice;
class tew extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("i am lessy");
				Thread.sleep(200);
			} }catch(InterruptedException e) {
				System.out.println("i got interupt");
			}
}
}
public class treadIntrupt {
	
		
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		tew t=new tew();
		t.start();
		t.interrupt();
		System.out.println("end of main");
	}

}
