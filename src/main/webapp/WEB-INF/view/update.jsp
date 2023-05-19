<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@page import="com.einfochips.springJPA.model.*"  %>
<%@page import="java.util.*" %>
<%@page %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">



<%

movie mo=(movie)request.getAttribute("value1");
%>
mid: <input type="number" name="mid" value="<%out.print(mo.getMovieId());%>"><br>
movie Name: <input type="text" name="mname" value="<%out.print(mo.getMoviename());%>"><br>
director : <input type="text" name="direc" value="<%out.print(mo.getDirector());%>"><br>
language: <input name="lang" value="<%out.print(mo.getLanguage());%>">
<input type="submit" value="update" >
<br></form>


${value1} 



	

</body>
</html>