<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h2>dashboard</h2>
<h2>Hello ${ lcDto.userName }</h2>
	<p>${ lcDto.userName } and ${ lcDto.crushName } are friends</p><br>	
	<a href="email-redirection">send via email</a>
</body>
</html>