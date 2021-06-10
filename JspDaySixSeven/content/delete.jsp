<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   
    <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/example" user="debian-sys-maint" password="a48qIJwnTfPENyKp" />

	<sql:update dataSource="${snapshot}" var="result" sql = "delete from demo where id = ?">
	<sql:param value="${param.id}"/>
	
</sql:update>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Deleted</h1>
</body>
</html>