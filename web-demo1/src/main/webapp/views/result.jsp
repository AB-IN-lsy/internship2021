<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>result.jsp</h1>
显示传递的字符串<br><br>
<!-- 
request.setAttribute("mystr", "Good Luck !!!!");
 -->
                     ${mystr }
                     
<br><br>
显示传递的对象：<br><br>
<!-- 
request.setAttribute("message", msg);
 -->
${message.mid }${message.author }${message.title }
</body>
</html>