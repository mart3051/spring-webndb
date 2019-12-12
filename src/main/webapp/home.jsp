<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addAlien">
 Id  :<input type="text" name="id"><br>
 Name: <input type="text" name="name"><br>
<input type="submit" value="Add">
</form>
<br>
<form action="getAlien">
<input type="submit" value="FetchList"/>
</form>
</body>
<form action="fetchByName">
Name: <input type="text" name="name"><br>
<input type="submit" value="FetchByName"/>
</form>
<form action="sortedByName">
<input type="submit" value="SortedByName"/>
</form>
</body>
</html>