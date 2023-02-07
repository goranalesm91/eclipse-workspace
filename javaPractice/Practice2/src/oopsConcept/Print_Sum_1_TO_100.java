package oopsConcept;

public class Print_Sum_1_TO_100 {
	public static void main(String [] args) {

int n=100;
System.out.println(sort(n));

	}
	public static int sort(int n) {
		if(n==1) return 1;
		return n+sort(n-1);
	}
}
