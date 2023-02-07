package Shoping;
 import java.util.*;
public class prise {
	static int Mangoes=65;
	static int Apples=100;
	public void furite() {
		System.out.println(" 125 ---- Mangoes ---- 1 Kg is 50\n 126 ---- Apples ---- 1 Kg is 100\n 127 ---- Grapes ---- 1 Kg is 60\n 128 ---- Papaya ---- 1 Kg is 50\n 129 ---- Bananans ---- 1 Kg is 50\n 130 ---- Oranges ---- 1 Kg is 50");
		System.out.println("Please enter your choice ");
		}
	
	public void choice(int n) {
		if(n==125) {
			System.out.println(" mango is good choice . How much kgs you need ?");

		}else if(n==126) {
			System.out.println(" Apple is good choice . How much kgs you need ?");
        }
	}
	public void pkg(int k) {
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" ===== WELCOME TO SHREE RAM SAI MART =====");
		System.out.println("-------------------------------------------");
		System.out.println("---- Available product in the store---- ");
		System.out.println(" 1 Friuits\n 2 Vegetables\n 3 Cosmetics\n 4 Masala Powders");
		System.out.println("Please enter your choice ");
		prise p=new prise();
  int n=sc.nextInt();
  if(n==1) {
	  p.furite();
	  int choice=sc.nextInt();
	  p.choice(choice);
	  int kg=sc.nextInt();
	  p.pkg(kg);
	  
	 
  }
	}

}
