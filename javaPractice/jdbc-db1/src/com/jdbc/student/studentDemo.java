package com.jdbc.student;

import java.sql.*;

public class studentDemo {
//	  private static Connection connection =null;

	public static void main(String[] args)  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Students";
		String user="root";
		String password="Siddhu@123";
	 Connection	con=	DriverManager.getConnection(url,user,password);
	 String q="select * from student";
	 Statement stat=con.createStatement();
	 ResultSet rs=stat.executeQuery(q);
	 while(rs.next())
	 {
		 System.out.println(rs.getInt("ID")+"  "+
	 rs.getString("NAME")+" "+rs.getInt("age"));
				 
	 }
	 int ans=stat.executeUpdate("insert into student(NAME,age) value("+"sham"+",22");
//	if(connection.isClosed()) {
//		System.out.println("true");
//	}else
//		System.out.println("FAlse");
}

}
