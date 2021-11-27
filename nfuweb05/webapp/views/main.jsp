<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>main.jsp</h1>

<!-- 
request.setAttribute("msgs", list);
 -->
<c:forEach  items="${msgs}"   var="msg">
	${msg.mid} --- ${msg.author} --- ${msg.title} <br><br>
</c:forEach>

</body>
</html>