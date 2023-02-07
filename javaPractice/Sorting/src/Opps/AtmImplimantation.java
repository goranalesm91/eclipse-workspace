/**
 * 
 */
package Opps;
import java.util.Scanner;
 
class Atm{
	private int balnce;
	private int withdrow;
	private int deposite;
	public void setBalnce(int balance) {
		this.balnce=balance;
	}
	public int  getBalnce() {
		return balnce;
	}
	
}
class impli extends Atm{
	 
	public void Deposite(int amout) {
		int b=getBalnce();
		setBalnce(b+amout);
		System.out.println(" your balance is "+getBalnce()+" your are deposited "+amout);
		return;
	}
	
	public void CheackBalance() {
		System.out.println("Your Balance is "+getBalnce());
	}
	
	public void withdrow(int amout) {
		int b=getBalnce();
		if(b>=amout) {
			b=b-amout;
			setBalnce(b);
		}else {
			System.out.println("inSufficeant Amount");
		}
	}
}
public class AtmImplimantation {

	public static void main(String[] args) {
		impli t=new impli();
          Scanner sc =new Scanner(System.in);
      System.out.print("  1. Enter 1 for Balnce cheack \n  2. Enter 2 for Withdrow Many\n  3. Enter 3 for Deposite many");
	
      int n=sc.nextInt();
      int pin=1234;
      int CardNo=123;
      if(n==1) {
    	  System.out.println("Enter your CardNomber ");
    	  int Cd=sc.nextInt();
    	  if(Cd==CardNo) {
    		  System.out.println("Enter your PIN");
    		  int PIN=sc.nextInt();
    		  if(PIN==pin) {
//    			  System.out.println();
    			  t.CheackBalance();
    			  
    			  
    		  }else {
        		  System.out.println("Wrong input");
        		  return;
        	  }
    	  }else {
    		  System.out.println("Wrong input");
    		  return;
    	  }
      }else if(n==2) {
    	  System.out.println("Enter your CardNomber ");
    	  int Cd=sc.nextInt();
    	  if(Cd==CardNo) {
    		  System.out.println("Enter your PIN");
    		  int PIN=sc.nextInt();
    		  if(PIN==pin) {
			  System.out.println("Enter Your Amount");
    			  int cash=sc.nextInt();
    			  t.withdrow(cash);
    			  
    			  
    		  }
    		  else {
        		  System.out.println("Wrong input");
        		  return;
        	  }
    	  }else {
    		  System.out.println("Wrong input");
    		  return;
    		  
    	  }
      }else if(n==3) {
    	  System.out.println("Enter your CardNomber ");
    	  int Cd=sc.nextInt();
    	  if(Cd==CardNo) {
    		  System.out.println("Enter your PIN");
    		  int PIN=sc.nextInt();
    		  if(PIN==pin) {
 			  System.out.println("Enter Your Amout");
    			  int cash=sc.nextInt();
    			  t.Deposite(cash);
    			  
    			  
    		  }
    		  else {
        		  System.out.println("Wrong input");
        		  return;
        		  
        	  }
    	  }else {
    		  System.out.println("Wrong input");
    		  return;
    	  }
      }else {
    	  System.out.println("Wrong input");
      }
      
	}

}
