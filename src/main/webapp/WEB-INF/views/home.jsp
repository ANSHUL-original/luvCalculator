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
	<form:form action="calc" modelAttribute="lcDto">
	<div>
		<p>
			<label for="un">User Name: </label>
			<form:input path="userName" id="un"/>
			<form:errors cssClass="errors" path="userName"/>
			<br>
		</p>
		<p>
			<label for="cn" >Crush Name: </label>
			<form:input path="crushName" id="cn"/>
			<form:errors cssClass="errors" path="crushName"/>
			<br>
		</p>
		<input type="submit" name="submit"/>
	</div>
	</form:form>

</body>
</html>