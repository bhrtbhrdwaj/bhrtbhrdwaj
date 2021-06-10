<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A demo record</title>
</head>
<body>
<h1>Database</h1>
<c:forEach var="demo" items="${demos}">
<p>
Id: <c:out value = "${demo.id}" default = "demo.id"/> Name: 
<c:out value = "${demo.name}" default = "demo.name"/>
</p>
 </c:forEach>
 <div>
 <form action="insertDemo.jsp" method="POST">
 Id: <input type="number" name="id"><br/>
 Name: <input type="text" name="name">
 <input type="submit" value="insert">
 </form>
 </div>
</body>
</html>