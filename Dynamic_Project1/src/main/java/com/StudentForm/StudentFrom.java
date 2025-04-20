package com.StudentForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentFrom extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter writer= res.getWriter();
		writer.println("<h1> -:Form Of Student:- </h1>");
		
		
		String name=req.getParameter("name");
		String add=req.getParameter("add");
		String th10=req.getParameter("10th");
		String th12=req.getParameter("12th");
		
		
		
		writer.println("<h3> Name of Student:- "+name+"</h3>");
		writer.println("<h3> Address of student:- "+add+"</h3>");
		writer.println("<h3> Marks in 10<sup>th</sup>:- "+th10+"</h3>");
		writer.println("<h3> Marks in 12<sup>th</sup>:- "+th12+"</h3>");
		
		
		
	}
	
	
}
