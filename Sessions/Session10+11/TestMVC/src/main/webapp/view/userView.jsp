<%@page import="com.itshare.mvc.model.Users"%>
<%@page import="java.util.List"%>
<%@page import="com.itshare.mvc.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    UserService userService = new UserService();
    List<Users> AllUsers= userService.getAllUsers();
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>User name</th>
<th>Gmail</th>
</tr>

<%
for(Users user : AllUsers){
%>
<tr>
<td><%=user.getUsername() %></td>
<td><%=user.getGmail() %></td>
</tr>
<%
}
%>

</table>
</body>
</html>