<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="org.h2.Driver" url="jdbc:h2:tcp://localhost/~/sjava" 
user="sa" password=""/>
<sql:query var="rs" dataSource="${db}">
select * from ureg
</sql:query>

<table border="1" width=100%>
<tr>
<th>UserName</th>
<th>Password</th>
<th>Mobile</th>
</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.email}"></c:out></td>
<td><c:out value="${table.pass}"></c:out></td>
<td><c:out value="${table.mobile}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>