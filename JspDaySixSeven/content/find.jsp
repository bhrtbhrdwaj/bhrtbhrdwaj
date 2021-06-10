<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
   
    <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/example" user="debian-sys-maint" password="a48qIJwnTfPENyKp" />

	<sql:query dataSource="${snapshot}" var="result" sql = "select * from demo where id = ?">
	<sql:param value="${param.id}"/>
	
</sql:query>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:if test="${result.rows[0].name eq null}">
No record found.
</c:if>
<c:if test="${result ne null }">
${result.rows[0].id} ${result.rows[0].name}
</c:if>
<h1>Delete</h1>
<form action="delete.jsp" method="POST">
Enter id: <input type="number" name="id">
<input type="submit" value="delete">
</form>
</head>
<body>

</body>
</html>