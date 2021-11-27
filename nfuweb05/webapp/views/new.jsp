<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>new.jsp</h1>

<form name="myform" method="post"  action="/nfuweb05/servlet3">

<li>昵称:
<input name="author" type="text" id="yhm"></li>
<li>标题:
<input name="title" type="text" id="email"></li>

<li>邮箱:
<input name="email" type="text" id="email"></li>
<li>内容:
<textarea name="content" cols="60" rows="10"></textarea></li>

<br><br>
 <input type="submit" name="regsubmit" value="提交" class="btn">
</form>
</body>
</html>