package com.SessionCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieServ extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter writer= res.getWriter();
		writer.println("<h1>Cookie Session Tracking</h1>");
		
		String name= req.getParameter("uname");
		writer.println("<h1>Nmae:- "+name+"</h1>");
		
//		Cookie Creation
		
//		Cookie c1=new Cookie("U_name", name);
//		res.addCookie(c1);

		
		
//		url  Rewriting
		
//		writer.println("<h3><a href='Cookie2?uname"+name+"'>GoToCookie2</a></h3>");
		writer.println("<h3><a href='Cookie2'>GoToCookie2</a></h3>");
		
		
		
		
//		Hidden form
		
//		writer.println("<form action='Cookie2'>"
//				+ "<input type='hidden' name='u_name' value='"+name+"'>"
//				+"<button type='submit'>Go To Servlet-2</button>"
//				+"</form>");
		
		
//		Http Session
		HttpSession session= req.getSession();
		session.setAttribute("u_name", name);
		writer.println("<h1><a href='Cookie2'>Cookie</a></h1>");
		
		
		
	}
}
