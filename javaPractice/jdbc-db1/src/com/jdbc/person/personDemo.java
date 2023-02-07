package com.jdbc.person;

import java.util.Scanner;
import java.sql.*;

public class personDemo {
  private static Connection connection =null;
  private static Scanner scanner=new Scanner(System.in);
  
  
	public static void main(String[] args) throws Exception {
		personDemo person=new personDemo();

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Students";
		String user="root";
		String password="Siddhu@123";
		connection=	DriverManager.getConnection(url,user,password);
		while(true) {
			System.out.println();
		System.out.println("Select chioce");
		  System.out.println("1 insert data");
		  System.out.println("2 show data");
		  System.out.println("3 to exit");

		  int choice=Integer.parseInt(scanner.nextLine());
		  
		
		switch (choice) {
		case 1:
			person.insertRecord();
			break;
		case 2:
			person.SelectData();
			break;
		case 3:
			System.exit(3);
			break;
			default:
				break;
		}
		}
	}
	public void insertRecord() throws SQLException {
//		System.out.println("good");
		String sql= "insert into person1 (id,name,age) values(?,?,?)";
		
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
		System.out.println("enter id");
		preparedStatement.setInt(1,Integer.parseInt(scanner.nextLine()));
		
		System.out.println("enter name");

		preparedStatement.setString(2, scanner.nextLine());
		System.out.println("enter age");

		preparedStatement.setInt(3, Integer.parseInt(scanner.nextLine()));
		int result=preparedStatement.executeUpdate();
		
		if(result>0) {
			System.out.print("everyThing is fine");
		}else {
			System.out.println("something went wornng");
		}
		
	}
	public void SelectData()  throws SQLException {
		String sql="select * from student";
//		System.out.println("curect");
		
		Statement statment=connection.createStatement();
		
		ResultSet result=statment.executeQuery(sql);
		
		while(result.next()) {
			int id=result.getInt("ID");
			
			
			String name=result.getString("NAME");
			int age=result.getInt("age");
			System.out.println(id+"  "+name+"   "+age);
		}
		
	}

}
