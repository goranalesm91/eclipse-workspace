package com.Code1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class firstServalet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("em");
		String pass=req.getParameter("ps");
		PrintWriter out=resp.getWriter();
		
		RequestDispatcher rs;
		if("siddhu@123".equals(email) && "1234".equals(pass)) {
		
			
			rs=req.getRequestDispatcher("/servalet2");
			
			rs.forward(req, resp);
			
		}else {
			out.println("invalid input");
		rs=	req.getRequestDispatcher("/index.html");
			rs.include(req, resp);
		}
		
	
	
	}

}
