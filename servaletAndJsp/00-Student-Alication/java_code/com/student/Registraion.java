package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/regieter")
public class Registraion extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String Number=req.getParameter("number");
	String Email=req.getParameter("email");
	String DOB=req.getParameter("date");
	
	
	
	JDBCC_Connection r=new JDBCC_Connection(name,Number,Email,DOB);
	boolean b=false;
	try {
		b=r.putData();
	}catch (Exception e) {
		System.out.println("servaar error");
	}
	PrintWriter out=resp.getWriter();
	if(b) {
		out.print("data added sucessfully");
	}
}
}