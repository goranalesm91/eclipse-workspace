package recursion;

public class powerLiner {
//  public static int printPowLiner(int n,int x) {
//	  if(n==0) return 1;
//	  return printPowLiner(n-1,x)*x;
//	  
//  }
	public static int printPowLiner(int n,int x) {
		  if(n==0) return 1;
		  int xpn1= printPowLiner(n/2,x);
		  
		  if(n%2!=0) return xpn1*xpn1*x;
		  
		  return xpn1*xpn1;
	  }
	public static void main(String[] args) {
  int pav=printPowLiner(2,4);
  System.out.print(pav+" ");

	}

}
