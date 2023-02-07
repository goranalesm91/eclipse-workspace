package factorialsOFNumber;

public class factorialofGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=5;
 System.out.println(factorial(n));
	}
	public static int factorial(int n) {
		if(n==0) return 1;
		return factorial(n-1)*n;
	}

}
