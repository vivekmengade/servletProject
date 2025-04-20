package com.Math;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MathOpServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		writer.println("<h1> Result </h1>");
		String n1=req.getParameter("num1");
		String n2=req.getParameter("num2");
		
		
		int num1 =Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		
		int sum=num1+num2;
		
		req.setAttribute("total", sum);
		
		writer.println("<h1> Sum= "+sum+"</h1>");
		
		RequestDispatcher rd = req.getRequestDispatcher("Product");
		rd.forward(req, res);
	}
	
}
