<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email sending</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h2>Email sending page</h2>
	<p>hello ${ lcDto.userName }</p><br>
	<form:form action="email-send" modelAttribute="emailDto">
		<label>Enter your email</label><br>
		<form:input path="email" type="email"/>
		<input type="submit" name="submit"/>
	</form:form>
</body>
</html>