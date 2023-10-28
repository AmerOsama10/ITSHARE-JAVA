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

<h1> welcome <%=app %></h1>
<p>This <%=user %> is stored in the session</p>
<p>This Application Name from Context: <%=app%></p>


<%

Cookie[] cookiesList=request.getCookies();

String usernameFromCookie=null;

for(Cookie cookie:cookiesList){
	if(cookie.getName().equals("username")){
		 usernameFromCookie=cookie.getValue();
		break;
	}
}

%>
<p>This Code from Cookie : <%=usernameFromCookie%></p>


<a href="LogoutServlet">Logout</a>
</body>
</html>