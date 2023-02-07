package Opps;
 class test{
	 public void add(int a, int b) {
		 System.out.println(a+b);
	 }
 }
 class testt extends test {
	public void max(int a,int b) {
		 if(a<b) {
			 System.out.println(b);
			 
		 }else {
			 System.out.println(a);
		 }
	 }
	 
 }
public class Inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  testt t=new testt();
  t.add(10,20);
 t.max(20,30);
  
	}

}
