package recursion;

public class print_1To_n {
	public static void print1TOn(int n) {
		if(n==0) return;
		print1TOn(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
int n=10;
print1TOn(n);
	}

}
