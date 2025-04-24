package com.SessionCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieServ2 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter writer= res.getWriter();
		writer.println("<h1>In Cookie Servelet 2</h1>");
		
		
//		Cookie[] carry= req.getCookies();
//		if(carry!=null) {
//			writer.println("<h2>cookie found</h2>");
//			
//			
//			for (Cookie c : carry) {
//				String name=c.getName();
//				writer.println("<h2>Cookie Name:- "+name+"</h2>");
//				
//				
//				String value=c.getValue();
//				writer.println("<h2>Value of Cookie: "+value+"</h2>");
//				
//			}
//			
//		}else {
//			writer.println("<h1>You are a new user</h2>");
//			
//		}
		
//		String name= req.getParameter("u_name");
//		writer.println("<h1>Name:- "+name+"</h1>");
		
		
		
		HttpSession session=req.getSession(true);
		String n= (String) session.getAttribute("u_name");
		writer.println("<h1>Name:- "+n+"</h1>");
		
	}
	
}
