<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int value1 =Integer.parseInt(request.getParameter("value1"));
	int value2 =Integer.parseInt(request.getParameter("value2"));
	int sub = value1-value2;
	out.print("sub"+sub);
	%>
</body>
</html>