package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Servalet1 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String Email=req.getParameter("name");
	String Password=req.getParameter("pass");
	
	Cookie ck=new Cookie("pas", Password);
	Cookie ck1=new Cookie("em", Email);
	resp.addCookie(ck1);
	resp.addCookie(ck);
}
}
