<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateemp" action="get">
Id:<input type="text" value="${empid}" name="empid" readonly><br>
Name:<input type="text" name="empname"><br>
Dob:<input type="date" name="dob"><br>
Salary:<input type="number" name="sal"><br>
<input type="submit" value="Update">
</form>
</body>
</html>