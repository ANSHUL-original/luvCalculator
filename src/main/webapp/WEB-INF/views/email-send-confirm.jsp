<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<h2>hello ${ lcDto.userName }</h2>
	<h2>${lcDto.userName} email send sucesfully on ${ emailDto }</h2>
</body>
</html>