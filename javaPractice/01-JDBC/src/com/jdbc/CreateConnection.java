package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnection {
	private Connection con;
	{
		try {
      Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Siddhu@123");
		
	}catch (Exception e) {
		System.out.println("error");
	}
	}
	public void getConnections(Student student) throws Exception{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Siddhu@123");
		
		PreparedStatement ps=con.prepareStatement("insert into student (Fast_name,Last_name,dateOfBirth) "
				+ "values(?,?,?)");
		ps.setString(1, student.getFast_name());
		ps.setString(2, student.getLast_name());

		ps.setString(3, student.getDateOfBirth());

		
		int num=ps.executeUpdate();
		if(num==1) {
			System.out.println("Date added sucessufully");
		}
		con.close();
		
	}
	public void showData() throws SQLException {
		String sql="Select * from student";
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		while(rs.next()) {
        System.out.println(rs.getString("id")+"  "+rs.getString("Fast_name")+ "  "+rs.getString("Last_name")+"  "
        +rs.getString("DateOfBirth"));			
		}
	}
	

}
