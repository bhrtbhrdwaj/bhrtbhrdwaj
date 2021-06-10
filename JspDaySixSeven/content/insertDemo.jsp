<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   
    <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/example" user="debian-sys-maint" password="a48qIJwnTfPENyKp" />

	<sql:update dataSource="${snapshot}" var="result">
	insert into demo values(${param.id}, '${param.name}' )
</sql:update>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Inserted</h1>
<%!   int counter = 0 ;   %>
<h3> Your visit to the site  :  </h3>  <%= ++counter %>
<form action="find.jsp" method="POST">
Enter id: <input type="number" name="id">
<input type="submit" value="Find">
</form>
</body>
</html>