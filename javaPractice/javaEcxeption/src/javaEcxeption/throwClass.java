package javaEcxeption;

import java.util.Scanner;

public class throwClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
		int a=10;
		collfun(a);

	}
	public static void collfun(int a) {
		if(a>18) {
			throw new ArithmeticException ("age is below 18");
		}else {
			System.out.println("you are yelder");
		}
	}

}
