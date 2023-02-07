/**
 * 
 */
package Opps;


public class Singletone {

	private static Singletone s=null;
	private Singletone() {
		
	}
 public static Singletone  getSingletone() {
	 if(s==null) {
		 s=new Singletone();
	 }
	 return s;
 }
	public static void main(String[] args) {
		Singletone t1=Singletone.getSingletone();
	}

}
