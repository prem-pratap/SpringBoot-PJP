<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post"><font color="cyan">
	<div>
	<h1>Enter your username:<input type="text" name="uname"></h1><br>
	<h1>Enter your password:<input type="password" name="pwd"></h1><br>
	<input type="submit" value="login">	
	</div>
</font>
</form>
<% String msg=(String) request.getAttribute("msg");
if(msg!=null){
%>
<h3 color="red"><%=msg %></h3>
<%} %>
</body>
</html>