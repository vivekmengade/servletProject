<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL page</title>
</head>
<body>
	
<%--
 
	<h1>This is Jstl page</h1>
	<a:set var="name" value="Advanto"></a:set>
	<h2>Value Of name Variable: <a:out value="${name}"></a:out></h2>
	
	
	<div>Removing Value</div>
	<a:remove var="name"/>
	<h2>Value Of name Variable: <a:out value="${name}"></a:out></h2>
	
	<div>use if</div>
	<a:set var="num" value="-11"></a:set>
	<a:if test="${10<=num}">
		<h1>Value of num is greater than or equal 10 = <a:out value="${num}"></a:out></h1>
	</a:if>
	
	
	
	<a:choose>
	<a:when test="${num>0}">
		<h1><a:out value="${num }"></a:out> = is positive </h1>
	</a:when>
	<a:otherwise>
		<h2><a:out value="${num }"> </a:out> = number is negative</h2>
	</a:otherwise>
	</a:choose>
	
	
	
	
	<a:forEach var="i" begin="1" end="10" >
		<h3>value of i:- <a:out value="${i}"></a:out> </h3>
	</a:forEach> -->
	
	
	
	 <a:url var="Google" value="https://www.youtube.com">Google</a:url> 
	 <a:redirect url="${Google }" ></a:redirect> --%>
	
	
	
	
	<a:set var="str" value="Vivek" ></a:set>
	<h1>length of str= <a:out value="${fn:length(str)}"></a:out></h1>
	<h1>Str contains= n <a:out value="${fn:contains(str,n) }"></a:out></h1>
	<h1>index of= e <a:out value="${fn:indexOf(str ,'e') }"></a:out></h1>
	<h1>Upper case =  <a:out value="${fn:toUpperCase(str) }"></a:out></h1>
	<h1>Ends With =  <a:out value="${fn:endsWith(str,'e') }"></a:out></h1>
	

</body>
</html>