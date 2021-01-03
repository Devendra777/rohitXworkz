<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib  prefix="j"   uri="http://java.sun.com/jsp/jstl/core"  %>
  <%@ taglib    uri="http://java.sun.com/jsp/jstl/sql" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
 
    <j:forEach  items= "${list}"   var="i">
    <br> 
    <j:out value="${i.paytmId}"></j:out> : <j:out value="${i.paytmAcounHolder}"></j:out> : <j:out value="${i.paytmCity}"></j:out> : <j:out value="${i.paytmPinNumber}"></j:out> 
    </j:forEach>
    
    
</body>
</html>