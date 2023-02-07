package com.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student_Info extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String Educ=req.getParameter("edu");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1> Name : "+name+"</h1>");
		out.print("<h1> Email : "+email+"</h1>");
		out.print("<h1> Password : "+pass+"</h1>");
		out.print("<h1> Eduction : "+Educ+"</h1>");
		
	}

}
