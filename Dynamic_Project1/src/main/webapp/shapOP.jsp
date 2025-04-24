<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shape Operation</title>
</head>
<body>
	<center>
	<h1 style="color: orange; background : gray;" > Area of Reactangle</h1>
	<%
	
	String n1=request.getParameter("length");
	String n2=request.getParameter("width");
	
	int n11=Integer.parseInt(n1);
	int n22=Integer.parseInt(n2);

	int area= n11*n22;
	
	%>	
	
		<h2>calculation <%= area %></h2>
	
	</center>

</body>
</html>