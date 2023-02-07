package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCC_Connection {
	String name;
	String number;
	String Email;
	String DOB;
	static Connection con;
	public JDBCC_Connection(String name, String number, String email, String dOB) {
		super();
		this.name = name;
		this.number = number;
		Email = email;
		DOB = dOB;
	}
	{
try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "Siddhu@123");
}catch (Exception e) {
	System.out.println("eroor on server");
}
	   
}
	
	public boolean putData() throws Exception {
		String sql="insert into Student1(name,number,email , date) values(?,?,?,?)";  
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2, number);
		ps.setString(3, Email);
		ps.setString(4, DOB);
		int num=ps.executeUpdate();
		if(num==1) return true;
		
		
		return false;
	}
	
}