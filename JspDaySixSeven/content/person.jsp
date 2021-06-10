<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4><c:out value="${person.name}" default="default"/></h4>
<form action="login.do" method="POST">
	Username: <input type="text" name="username">
	Password: <input type="password" name="password">
	<input type="submit" value="login"> 
</form>
</body>
</html>