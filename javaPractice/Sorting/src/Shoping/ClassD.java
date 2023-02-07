package Shoping;

import java.util.Scanner;

public class ClassD 

	{
		Scanner sc=new Scanner(System.in);
		int kg =0;
 static void meth1()
	{
		System.out.println("---- Available product in the store---- ");
		System.out.println(" 1) Friuits");
		System.out.println(" 2) Vegetables");
		System.out.println(" 3) Cosmetics");
		System.out.println(" 4) Masala Powders");
		
	}
	
	void display() 
	
{
		System.out.println("Please enter your choice ?");
		int choice = sc.nextInt();
		
	switch(choice) 
	
	{
	
	 case 1: 
		{
			System.out.println(" 125 ---- Mangoes ---- 1 Kg is 55");
			System.out.println(" 126 ---- Apples ---- 1 Kg is 100");
			System.out.println(" 127 ---- Grapes ---- 1 Kg is 60");
			System.out.println(" 128 ---- Papaya ---- 1 Kg is 50");
			System.out.println(" 129 ---- Bananans ---- 1 Kg is 30");
			System.out.println(" 130 ---- Oranges ---- 1 Kg is 50");
			
			System.out.println(" Please choose your product code : ");
			int code = sc.nextInt();
			
		if(code == 125) 
		{
			System.out.println(" Oranges is good choice . How much kgs you need ?");
		}
		else if(code == 126) 
		{
			System.out.println(" Apples is good choice . How much kgs you need ?");
		}
		else if(code == 127) 
		{
			System.out.println(" Grapes is good choice . How much kgs you need ?");
		}
		else if(code == 128) 
		{
			System.out.println(" Papaya is good choice . How much kgs you need ?");
		}
		else if(code == 129) 
		{
			System.out.println(" Bananans is good choice . How much kgs you need ?");
		}
		else if(code == 130) 
		{
			System.out.println(" Mangoes is good choice . How much kgs you need ?");
		}
		else 
		{
			System.out.println(" You Enter the WRONG Product Code .");	
			System.out.println("----------------------------------");
				meth1();
			   new ClassD().display();	// Return call to case 1
		
		}
			 kg = sc.nextInt();	
		   System.out.println(" if want to continue with shopping press 1 ");
		   new ClassD().meth2();
		   break ;
		}
	case 2:
		{
			System.out.println(" 225 ---- Patato ---- 1 Kg is 55");
			System.out.println(" 226 ---- Brinjal ---- 1 Kg is 100");
			System.out.println(" 227 ---- Carrots ---- 1 Kg is 60");
			System.out.println(" 228 ---- Beetroot ---- 1 Kg is 50");
			System.out.println(" 229 ---- Drumstick ---- 1 Kg is 30");
			System.out.println(" 230 ---- Mushroom ---- 1 Kg is 50");
			
			System.out.println(" Please choose your product code : ");
			int code = sc.nextInt();
			
		if(code == 225) 
			{
				System.out.println(" Patato is good choice . How much kgs you need ?");

			} 
		else if (code == 226) 
			{
				System.out.println(" Brinjal is good choice . How much kgs you need ?");
			
			} 
		else if( code == 227) 
			{
				System.out.println(" Carrots is good choice . How much kgs you need ?");
			} 
		else if(code == 228) 
			{
				System.out.println(" Beetroot is good choice . How much kgs you need ?");
			} 
		else if (code == 229) 
			{
				System.out.println(" Drumstick is good choice . How much kgs you need ?");
			} 
		else if(code == 230)
			{
				System.out.println(" Mashroom is good choice . How much kgs you need ?");	
			}
		else 
			{
				System.out.println(" You Enter the WRONG Product Code ");
				System.out.println("----------------------------------");
				meth1();
				new ClassD().display();
			}
			
			 kg=sc.nextInt();	
			System.out.println(" if want to continue with shopping press 1 ");
			 new ClassD().meth2();
		   break;
					
		}
	case 3:
	{
		System.out.println(" 335 ---- skinCare ---- 1 Qty is 55");
		System.out.println(" 336 ---- perfumesl ---- 1 Qtyis 100");
		System.out.println(" 337 ---- hairDyes  ---- 1 Qty is 60");
		System.out.println(" 338 ---- Powders ---- 1 Qty is 50");
		System.out.println(" 339 ---- shampoo  ---- 1 Qty is 30");
		System.out.println(" 340 ---- faceWash ---- 1 Qty is 50");
		
		System.out.println(" Please choose your product code : ");
			int code = sc.nextInt();
	
		if(code == 335) 
		{
				System.out.println(" skinCare is good choice . How much Qty you need ?");
		} 
		else if (code == 336) 
		{
				System.out.println(" perfumes is good choice . How much Qty you need ?");	
		} 
		else if( code == 337) 
		{
				System.out.println(" hairDyes is good choice . How much Qty you need ?");
		} 
		else if(code == 338) 
		{
				System.out.println(" Powders is good choice . How much Qty you need ?");
		} 
		else if (code == 339) 
		{
				System.out.println(" shampoo is good choice . How much Qty you need ?");
		} 
		else if(code == 340)
		{
				System.out.println(" faceWash  is good choice . How much Qty you need ?");	
		}
		else 
		{
				System.out.println(" You Enter the WRONG Product Code . Please enter Correct Product Key");
				System.out.println("----------------------------------");
				meth1();
				new ClassD().display();
		}
				kg=sc.nextInt();	
			System.out.println(" if want to continue with shopping press 1 ");
			break ;	
		}
	case 4:
	{
		System.out.println(" 445 ---- LalMirch ---- 1 Qty is 55");
		System.out.println(" 446 ---- KaliMirch ---- 1 Qtyis 60");
		System.out.println(" 447 ---- Ginger  ---- 1 Qty is 10");
		System.out.println(" 448 ---- GaramMasala ---- 1 Qty is 35");
		System.out.println(" 449 ---- Salt  ---- 1 Qty is 10");
		System.out.println(" 450 ---- PanchMasala ---- 1 Qty is 45");
		
		System.out.println(" Please choose your product code : ");

		int code = sc.nextInt();
		
		if(code == 445) 
		{
				System.out.println(" LalMirch is good choice . How much Qty you need ?");
		} 
		else if (code == 446) 
		{
				System.out.println(" KaliMirch is good choice . How much Qty you need ?");	
		} 
		else if( code == 447) 
		{
				System.out.println(" Ginger is good choice . How much Qty you need ?");
		} 
		else if(code == 448) 
		{
				System.out.println(" GaramMasala is good choice . How much Qty you need ?");
		} 
		else if (code == 449) 
		{
				System.out.println(" Salt is good choice . How much Qty you need ?");
		} 
		else if(code == 450)
		{
				System.out.println(" PanchMasala  is good choice . How much Qty you need ?");	
		}
		else 
		{
				System.out.println(" You Enter the WRONG Product Code . Please enter Correct Product Key");
				System.out.println("----------------------------------");
				meth1();
				new ClassD().display();
		}
				kg=sc.nextInt();	
			System.out.println(" if want to continue with shopping press 1 ");
			break ;	
		
		
	}
		
    }
}
 void meth2()
{
	 String str,add;
	 long MobNo;
	 
	int press = sc.nextInt();
	
	if(press == 1) 
	{
		meth1();
		new ClassD().display();	
	}
	else if(press == 2)
	{
		 System.out.println("---- WELCOME TO SHREE RENUKACHARYA MART ----");
			
		
		 System.out.println("Enter your name :");
		 sc.nextLine();
		  str = sc.nextLine();
		
		 System.out.println("Enter your Mobile Number :");
		  MobNo=sc.nextLong();
		 
		 System.out.println("Enter your Address :");
		sc.nextLine();
		  add = sc.nextLine();
		 
		 int patato = 50;
		int shampoo = 40;
		int BillPatato = (kg *patato);
		int Shampoo =(kg * shampoo);
		System.out.println("BillPatato :" + BillPatato);
		System.out.println("BillOfShampoo :" + Shampoo);
		
		int TotalAmount = BillPatato + Shampoo;
		 System.out.println("Total bill of your purchesed items :"+ TotalAmount);
		 
		 int discount = TotalAmount* 5/100;
		 System.out.println("You recevied discount of 5% :" + discount );
		 int finalBill= TotalAmount - discount;
		 System.out.println("Final bill is :" + finalBill);
		 System.out.println("------- Thank You for shopping you saved"+discount+"rs");
		 System.out.println("--------------- JAVA IS AWESOME --------------");
		 System.out.println("--------- VISIT AGIN ---------");
	}
	sc.close();
}
		   
	
public static void main(String[] args)
 	{
	System.out.println(" ===== WELCOME TO SHREE RENUKACHARYA MART =====");
	System.out.println("-------------------------------------------");
	
	ClassD aobj = new ClassD();
	meth1();
	aobj.display();
	aobj.meth2();	
 	}
}