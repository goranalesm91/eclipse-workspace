package com.cookes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/seravalet2")
public class servalet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	
	resp.setContentType("text/html");
	
	Cookie []ck=req.getCookies();
	
	
	out.print("name= "+ck[0].getValue()+"  "+ck[0].getSecure());

	
}
}
