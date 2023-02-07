package Shoping;
import java.util.*;


public class orders {
Scanner sc = new Scanner(System.in);
	
	static void  meth1() {
		System.out.println(" ===== WELCOME TO SHREE RAM SAI MART =====");
		System.out.println("-------------------------------------------");
		System.out.println("---- Available product in the store---- ");
		System.out.println(" 1 Friuits\n 2 Vegetables\n 3 Cosmetics\n 4 Masala Powders");
		
	}
		void meth2() 
		{
		System.out.println("Please enter your choice ");
		int Number = sc.nextInt();
		
		if(Number == 1) {
			System.out.println(" 125 ---- Mangoes ---- 1 Kg is 50\n 126 ---- Apples ---- 1 Kg is 100\n 127 ---- Grapes ---- 1 Kg is 60\n 128 ---- Papaya ---- 1 Kg is 50\n 129 ---- Bananans ---- 1 Kg is 50\n 130 ---- Oranges ---- 1 Kg is 50");
			 
		} 
		else 
		{
			System.out.println(" Enter the Invlaid Number Please Check Number");
			new orders().meth2();
			
		}
		
			System.out.println(" Please choose your product code : ");
			int code = sc.nextInt();
		if(code == 125) 
		{
				System.out.println(" Oranges is good choice . How much kgs you need ?");

			} 
		if (code == 126) 
		{
				System.out.println(" Apples is good choice . How much kgs you need ?");
			} 
		if( code == 127) 
		{
				System.out.println(" Grapes is good choice . How much kgs you need ?");
			} 
		if(code == 128) 
		{
				System.out.println(" Papaya is good choice . How much kgs you need ?");
			} 
		if (code == 129) 
		{
				System.out.println(" Bananans is good choice . How much kgs you need ?");
			} 
		if(code == 130)
		{
				System.out.println(" Papaya is good choice . How much kgs you need ?");	
			}
		
		
		
			int kg =sc.nextInt();
			
			System.out.println(" if want to continue with shopping press 1 ");
			int press = sc.nextInt();
			
			if(press == 1) {
				meth1();
			} else if ( press == 2){
				
				System.out.println(" ------------------------");
				System.out.println(" ---- Welcome Shri Sai Ram Mart--------------");
				System.out.println(" ------------------------");
				
			}
		}
	
public static void main(String[] args) {
	meth1();
	orders aobj= new orders();
	aobj.meth2();
}
}
	


