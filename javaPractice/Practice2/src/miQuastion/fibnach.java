package miQuastion;

public class fibnach {

	public static void main(String[] args) {
		
		
		int n=10;
		for(int i=0;i<n;i++) {
			System.out.println(fib(i));
		}
	}
	public static int fib(int n) {
		if(n==1 ||n==0) return n;
		return fib(n-1)+fib(n-2);
	}

}
