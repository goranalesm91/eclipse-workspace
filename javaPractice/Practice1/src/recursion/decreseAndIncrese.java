package recursion;

import java.util.Scanner;

public class decreseAndIncrese {
	
	public static void print(int n) {
		if(n==1) {
			System.out.println(n);
			return ;
		}
		System.out.println(n);
		print(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  
  
  print(n);
	}

}
