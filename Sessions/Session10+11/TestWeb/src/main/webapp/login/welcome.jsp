<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		String user = (String)session.getAttribute("username");
		String app  = (String)application.getAttribute("appName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> welcome <%=user %></h1>
<p>This <%=user %> is stored in the session</p>
<p>This Application Name : <%=app%></p>

<a href="LogoutServlet">Logout</a>
</body>
</html>