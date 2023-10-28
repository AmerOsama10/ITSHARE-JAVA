<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%

String sessionName=(String) application.getAttribute("sessionName");
String className= (String)application.getAttribute("className");
int number =(int)application.getAttribute("number");
List<String> listProduct=(List<String>)application.getAttribute("products");


%>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>session name :<%=sessionName %></p>
<p>class name : <%=className %></p>
<p>number :<%=number %></p>
<p>products :<%=listProduct.toString() %></p>



</body>
</html>