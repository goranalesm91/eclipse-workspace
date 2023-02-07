package com.hdfc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ATM_01 {
	
	static Connection con;
	static String AccountHolderName;
	static int password;
	
	
	public static void main(String[] args) throws Exception{
		Scanner sc =new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Siddhu@123");
		
		while(true) {
			
			System.out.println("Welcome to HDFC BANK");
		System.out.println("Enter Password");
		int pass=sc.nextInt();
		Statement sta1=con.createStatement();
		ResultSet set1=sta1.executeQuery("select name from hdfcbank where passcode ="+pass+";");
		while(set1.next())
		{
			AccountHolderName= set1.getString("name");
//			password=set1.getInt("passCode");
//			System.out.println(AccountHolderName);
			password=pass;
		}
		while(true) {
		if(pass == password )
		{
//			System.out.println("Processing...");
//			Thread.sleep(3000);
		
			System.out.println("Account Holder Nname : " + AccountHolderName);
			System.out.println(" 1) check Balance \n 2) Withdrawal amount \n 3) Mini Statement \n 4) Deposit Amount \n 5) exit");
			System.out.println("Choose Option");
			int check=sc.nextInt();
			if(check == 1)
			{
				Statement sta=con.createStatement();
				ResultSet set=sta.executeQuery("select balance from hdfcbank where name ='"+AccountHolderName+"';");
				while(set.next())
				{
					System.out.println("balance : "+ set.getInt("balance"));
				}
			}
			else if(check == 2)
			{
				//System.out.println("Enter withdrawal amount");
				
				String query="update hdfcbank set balance=balance - ? where name ='"+AccountHolderName+"'";

				PreparedStatement psmt= con.prepareStatement(query);
				System.out.println("Enter withdrawal amount");
				int s=sc.nextInt();
				psmt.setInt(1,s);
				psmt.executeUpdate();
				Statement sta=con.createStatement();
				int updatedbal=0;
				ResultSet set=sta.executeQuery("select balance from hdfcbank where name ='"+AccountHolderName+"';");
				while(set.next())
				{
					System.out.println("balance : "+ set.getInt("balance"));
				}	
				String query2 ="insert into "+AccountHolderName+"(Deposite,Withdrow,T_type,balance) values(?,?,?,?)";
				PreparedStatement psmt1= con.prepareStatement(query2);
//				System.out.println(query2);

				psmt1.setInt(1,0);
				psmt1.setInt(2,s);
				psmt1.setString(3,"withdrawal");
				psmt1.setInt(4,updatedbal);
				psmt1.executeUpdate();
			}else if(check==3) {
				Statement sta=con.createStatement();
				ResultSet set=sta.executeQuery("select * from "+AccountHolderName +";");
				System.out.println("Mini Statment of "+AccountHolderName);
				System.out.println("id Dep With type bal");


			 	while(set.next())
				{
					System.out.println(set.getInt("id")+"   "+set.getInt("Deposite")+"   "+set.getInt("Withdrow")+"   "+set.getString("T_type")+"   "+set.getInt("balance"));
				}
			}
			else if(check ==4)
			{
					String query = "update hdfcbank set balance=balance + ? where name ='"+AccountHolderName+"'";
				
				PreparedStatement psmt= con.prepareStatement(query);
				System.out.println("Enter Deposit"
						+ " amount");
				String s=sc.next();
				psmt.setInt(1,Integer.parseInt(s));
				psmt.executeUpdate();
				Statement sta=con.createStatement();
				int updatedbal=0;
				ResultSet set=sta.executeQuery("select balance from hdfcbank where name ='"+AccountHolderName+"';");
				while(set.next())
				{
					System.out.println("balance : "+ set.getInt("balance"));
					updatedbal=set.getInt("balance");
				}	
				String query2 ="insert into "+AccountHolderName+"(Deposite,Withdrow,T_type,balance) values(?,?,?,?)";
				PreparedStatement psmt1= con.prepareStatement(query2);
//				System.out.println(query2);

				psmt1.setInt(1,Integer.parseInt(s));
				psmt1.setInt(2,0);
				psmt1.setString(3, "Deposite");
				psmt1.setInt(4,updatedbal);
				psmt1.executeUpdate();




			}else if(check==5) {
				String ar[]=new String[0];
				main(ar);
				
			}
			
		}
		else
		{
			System.out.println("Incorrect Password");
			String ar[]=new String[0];
			main(ar);
			System.exit(0);
			sc.close();
		}
		

		}
	}

	}

}
