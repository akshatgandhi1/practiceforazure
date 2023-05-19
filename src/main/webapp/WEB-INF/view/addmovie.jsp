<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertmovie">
movie Name: <input type="text" name="mname"><br>
director : <input type="text" name="direc"><br>
language: <select name="lang">
<option value="lang"></option>
<option value="english">English</option>
<option value="hindi">hindi</option>
<option value="others">others</option>
</select><br>
<input type="submit" value="Insert movie"><br>
</form>

</body>
</html>