package recursion;

public class printEvenNumber {
public static void printEven(int n) {
	if(n==1) {
		System.out.println(1);
		return ;
	}
	System.out.println(n);
		printEven(n-1);
		
		System.out.println(n);
}
	public static void main(String[] args) {
int n=10;
printEven(n);
	}

}
