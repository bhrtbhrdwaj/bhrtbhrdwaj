<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>
	<c:set var="welcome" value="Hello!!"/>
	<c:out value="${welcome}" default="default"/>
	<a href="showPerson.do">Show Person</a>
	
	<% int x = 10; %>
	<h1>Value of X: <%= x %></h1>
	------------------------------------------
	<div>
		<form action = "show.jsp" method = "POST">
		Username: <input type = "text" name = "username">
		<input type = "submit" value = "Submit" >
		</form>
	</div>
	----------------------------------------
	
	<form action="loginDemo.do" method="POST">
	Id: <input type="number" name="id">
	Name: <input type="text" name="name">
	<input type="submit" value="login"> 
	</form>
	---------------------------------
	<form action="signupDemo.do" method="POST">
	Id: <input type="number" name="id">
	Name: <input type="text" name="name">
	<input type="submit" value="signup"> 
	</form>
</body>
</html>