<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ page import ="ua.com.pavelsavchenko.db.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World12</h1>>
<br/>
<%
for (String name : DatabaseFacade.getBooks()) {
	out.println(name + "<br/>");
}
%>  // скриплет
</body>
</html>