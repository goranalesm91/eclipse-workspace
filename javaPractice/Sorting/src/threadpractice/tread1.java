package threadpractice;

class mytread extends Thread{
	 public void run() {
//		 super.start();
		for(int i=0;i<5;i++) {
			 System.out.println("hellou");
		}
	 }
	 public void start() {
		 System.out.println("hi");
		 super.start();
		 System.out.println("yes");
	 }
}
public class tread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  mytread t=new mytread();
  t.start();
  for(int i=0;i<6;i++) {
		 System.out.println("yes");
	}
	}

}

