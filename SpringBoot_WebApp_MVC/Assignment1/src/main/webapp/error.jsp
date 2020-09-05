<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invalid Credentials</title>
</head>
<body>
<% String msg=(String) request.getAttribute("msg");
if(msg!=null){
%>
<font color="red"><h2><%=msg %></h2></font>
<%} %>
</body>
</html>