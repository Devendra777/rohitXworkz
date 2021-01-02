<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<form action="java.jsp">
Name: <input type="text" name="name">
Age : <input type="text" name="age">
<input type="submit" value="SUBMIT">
</form>

</body>
<% 

 String name = request.getParameter("name");
String age = request.getParameter("age");
  request.setAttribute("name", name);
  request.setAttribute("age", age);
  
%>
<%-- <%
String nm = (String)request.getAttribute("name");
%>
<h1>Welcome  ${ loginname } and age is ${ loginage }  </h1>
<%=  age %> --%>
</html>