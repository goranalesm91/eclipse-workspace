package threadpractice;
class Dispaly{
	
	public static  synchronized void wish(String s) {
		for(int i=0;i<10;i++) {
  System.out.print("Good morning : ");
  try {
	  Thread.sleep(2000);
  }catch(InterruptedException e) {}
	  System.out.println(s);
  }
	}
}
class mythre extends Thread{
	Dispaly d;
	String name;
	public mythre(Dispaly d,String name) {
		this.d=d;
		this.name=name;
		
	}
	public void run() {
		d.wish(name);
	}
}

public class SyncronyzationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dispaly t1=new Dispaly();
		Dispaly t2=new Dispaly();
		mythre d1=new mythre(t1,"siddhu");
		d1.start();
		mythre d2=new mythre(t2,"pintu");
		d2.start();
		

	}

}
