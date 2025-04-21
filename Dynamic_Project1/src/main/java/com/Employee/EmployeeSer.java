package com.Employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeSer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        writer.println("<h1>--:Employee Details:--</h1>");

        String name = req.getParameter("Ename"); 
        String pos = req.getParameter("pos");
        String sal = req.getParameter("sal");
        String add = req.getParameter("add");
        String id = req.getParameter("id");

        writer.println("<h4>Employee Name:- " + name + "</h4>");
        writer.println("<h4>Employee Position:- " + pos + "</h4>");
        writer.println("<h4>Employee Salary:- " + sal + "</h4>");
        writer.println("<h4>Employee Address:- " + add + "</h4>");
        writer.println("<h4>Employee Id Number:- " + id + "</h4>");
    }
}
