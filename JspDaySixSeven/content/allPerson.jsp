<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import = "java.util.*"   %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Person</title>
</head>
<body>
<h1>All Person</h1>
<% response.setHeader("refresh","5"); %>
<%  Date d = new Date( ) ;   %>
Time Particulars: <BR>  <BR>
Hours: <%=  d.getHours( )   %>   <BR>
Minutes: <%=   d.getMinutes( )   %>   <BR>
Seconds: <%=  d.getSeconds( )   %> 
<c:forEach var = "person" items = "${persons}">
<p>
<c:out value = "${person.name}" default = "person.name"/>
</p>
</c:forEach>
<a href="database.do">Get all from demo table</a>
</body>
</html>