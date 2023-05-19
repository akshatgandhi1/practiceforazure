<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>view all movies.. over here</h1>
<h2>${movies}</h2>

<br>
<a href="viewbylanguage?lang=English">english</a>
<br>
<a href="viewbylanguage?lang=hindi">hindi</a><br>
<a href="viewbylanguage?lang=others">others</a>

<form action="updatebyid">
movie_id: <input type="number" name="mid">

<input type="submit" value="update movie"><br>
</form>
</body>
</html>