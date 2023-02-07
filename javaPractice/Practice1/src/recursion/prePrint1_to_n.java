package recursion;

public class prePrint1_to_n {
	public static void reversprint(int n) {
		if(n==0) return ;
		System.out.println(n);
		reversprint(n-1);
	}

	public static void main(String[] args) {
		int n=10;
		reversprint(n);

	}

}
