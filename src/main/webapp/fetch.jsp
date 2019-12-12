<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach items="${alienList}" var="alien">
    <tr>
        <td>Alien ID: <c:out value="${alien.id}"/></td>
        <td>Alien  Name: <c:out value="${alien.name}"/></td>  
    </tr>
</c:forEach>
</table>
</body>
</html>