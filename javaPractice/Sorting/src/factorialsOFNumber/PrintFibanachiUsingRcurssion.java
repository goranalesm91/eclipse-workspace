package factorialsOFNumber;

public class PrintFibanachiUsingRcurssion {

	public static void main(String[] args) {
int n=10;
//  for(int i=0;i<n;i++) {// 0,1,2,3,4,5
	  System.out.println(recurrsion(55));// 0 1,1,2,3
//  }
	}
	public static int recurrsion(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return recurrsion(n-2)+recurrsion(n-1);
	}

}
