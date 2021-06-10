<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="ex" uri="WEB-INF/Custom.tld" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${param.username}</title>
</head>
<body>
<ex:MyTag/>
<table border="1px">
<c:forEach var="req" items="${header}">
<tr><td>
    <strong><c:out value=
        "${req.key}"/></strong></td><td> <c:out value="${req.value}"/></td></tr>

</c:forEach>
</table>
<jsp:useBean id="person" class="com.training.servlet.Person">
<jsp:setProperty name="person" property="name" param = "username"/>
</jsp:useBean>

<h1>Welcome! ${param.username}</h1>
<h2>Welcome! <jsp:getProperty name="person" property="name"/></h2>

<a href="allPerson.do">Get all person</a>
</body>
</html>