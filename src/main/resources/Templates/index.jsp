<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thymeleaf Application</title>
</head>
<body>
<h2> Welcome to Employee Management Application</h2>

<div align = "center">

 
  <a th:href="@{firstName}">firstName</a> |
  <a th:href="@{lastName}">lastName</a> |
  <a th:href="@{salary}">salary</a> |
  <a th:href="@{email}">email</a>
</div>
</body>
</html>