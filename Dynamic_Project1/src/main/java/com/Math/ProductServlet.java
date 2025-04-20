package com.Math;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		writer.println("<h1> Result Product</h1>");
		
		
		String n1=req.getParameter("num1");
		String n2=req.getParameter("num2");
		
		int n11=Integer.parseInt(n1);
		int n22=Integer.parseInt(n2);
		
		int product = n11*n22;
		
		
		Integer sum1=(Integer) req.getAttribute("total");
		
		writer.println("<h1>Sumbmition: "+sum1+"</h1>");
		writer.println("<h1>Product: "+product+"</h1>");
		
		
	}
	
	
}
