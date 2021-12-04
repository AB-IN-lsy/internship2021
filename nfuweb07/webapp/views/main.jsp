<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>天一时代留言本</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/nfuweb07/images/web.css" rel="stylesheet" type="text/css">
</head>    
<body>
<div id="wrapper">
        <div id="header">
                 <div id="logo"></div>
                        <div id="blog-header">
                            <h1 class="blog-title"><a href="index.html">天一时代留言本 1.0</a></h1>
                            <div class="blog-desc">欢迎光临天一时代</div>
                        </div>
                        <div id="menu">
                            <ul>
                                <li><a href="index.html">留言首页</a></li>
                                <li><a href="/nfuweb07/views/new.jsp">签写留言</a></li>
								<li><a href="login.html">登陆后台</a></li>
                            </ul>
                        </div>
        </div>
        
		<div id="mainWrapper">
               <div id="content" class="content-wide">
 			   <form action="#" method="post" >
               姓名：<input type="text" name="userName"/>邮件：<input type="text" name="email"/>内容：<input type="text" name="content"/>
			   <input type="submit" value="查找"/>
			   </form>
			   <br><br>
			   
			   <c:forEach  items="${msgs}"   var="msg">
               <div class="textbox">
								<div class="textbox-title">
								
								<div class="textbox-label">[标题：${msg.title} ][留言者:${msg.author} ][留言日期:${msg.add_date} ]</div>
								</div>
								<div class="textbox-content">${msg.content }</div>
								
								<div class="textbox-bottom">邮箱: ${msg.email} | <a href="/nfuweb07/delete?mid=${msg.mid}" >删除</a>| 
								<a href="/nfuweb07/findone?mid=${msg.mid}" >修改</a></div>
			  </div>
			  </c:forEach>
			  <%/*   
			  <!--
			  <div class="textbox">
								<div class="textbox-title">
								
								<div class="textbox-label">[标题 ][留言者:张三丰 ][留言日期:2021-02-03 ]</div>
								</div>
								<div class="textbox-content">选择适合的语言和软件版本下载,如果您需要下载其它语言版本,请点击此处。 ESET NOD32防病毒软件3.0版下载地址ESET NOD32防病毒软件——简体中文 版本 文件大小 下载Windows XP/Vista(32位)版本 3.0.684 17 MB 下载Windows XP/Vista</div>
								
								<div class="textbox-bottom">邮箱: dz910@126.com | <a href="#" >删除</a>| <a href="#" >修改</a></div>
			  </div>
			  <div class="textbox">
								<div class="textbox-title">
								
								<div class="textbox-label">[标题 ][留言者:张三丰 ][留言日期:2021-02-03 ]</div>
								</div>
								<div class="textbox-content">选择适合的语言和软件版本下载,如果您需要下载其它语言版本,请点击此处。 ESET NOD32防病毒软件3.0版下载地址ESET NOD32防病毒软件——简体中文 版本 文件大小 下载Windows XP/Vista(32位)版本 3.0.684 17 MB 下载Windows XP/Vista</div>
								
								<div class="textbox-bottom">邮箱: dz910@126.com | <a href="#" >删除</a>| <a href="#" >修改</a></div>
			  </div>
			  <div class="textbox">
								<div class="textbox-title">
								
								<div class="textbox-label">[标题 ][留言者:张三丰 ][留言日期:2021-02-03 ]</div>
								</div>
								<div class="textbox-content">选择适合的语言和软件版本下载,如果您需要下载其它语言版本,请点击此处。 ESET NOD32防病毒软件3.0版下载地址ESET NOD32防病毒软件——简体中文 版本 文件大小 下载Windows XP/Vista(32位)版本 3.0.684 17 MB 下载Windows XP/Vista</div>
								
								<div class="textbox-bottom">邮箱: dz910@126.com | <a href="#" >删除</a>| <a href="#" >修改</a></div>
			  </div>

				-->
				*/ %>
                    </div>
                </div>
                <div id="footer">
                    <div id="innerFooter">Powered by Tianyitime; Copyright &copy;</div>
                </div>
            
        </div>  
</body>
</html>
