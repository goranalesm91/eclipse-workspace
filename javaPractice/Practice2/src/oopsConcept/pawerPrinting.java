package oopsConcept;

public class pawerPrinting {
	public static void main(String args[]) {
	int n=2;
	int pav=3;
	int ans=1;
	while(pav>0) {
		ans*=n;
		pav--;
	}
	System.out.println(ans);
//System.out.println(pawer(n,pav));
	}
	public static int pawer(int n,int pav) {
		if(pav==0) return 1;
		return n*pawer(n,pav-1);
	}
}
