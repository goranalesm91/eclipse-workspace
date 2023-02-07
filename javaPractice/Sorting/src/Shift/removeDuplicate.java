package Shift;
import java.util.*;
public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<Integer> set= new HashSet<>();
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]= new int [n];
    for(int i=0;i<n;i++) {
    	ar[i]=sc.nextInt();
    }
	
	for(int i=0;i<n;i++) {
		set.add(ar[i]);
	}
	System.out.println(set);
	}
}
