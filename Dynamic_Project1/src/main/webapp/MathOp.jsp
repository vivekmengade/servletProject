<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Math op JSP</title>
</head>
<body>
	<center>
		<h1>-:Result Of code:-</h1>
	 </center>
	 
	 
	 <%
	 
	 String n1=request.getParameter("num1");
	 String n2=request.getParameter("num2");
	 
	 int n=Integer.parseInt(n1);
	 int m=Integer.parseInt(n2);
	 
	 int sum=n/m;
	 
	 %>
	 
	 <h1>Division of 2 numbers:- <%= sum %></h1>
	 <%@ include file="Test.jsp"%>
	 
	 
	 
</body>
</html>