<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>写留言-天一时代留言本</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/nfuweb07/images/web.css" rel="stylesheet" type="text/css">
</head>
<body>
<form name="myform" method="post" action="/nfuweb07/save" >
 <div id="wrapper">
           
                <div id="header">
                    
                        <div id="logo"><img src="/nfuweb07/images/logo.gif"/></div>
                        <div id="blog-header">
                            <h1 class="blog-title"><a href="index.html">天一时代留言本 1.0</a></h1>
                            <div class="blog-desc">欢迎光临天一时代留言本</div>
                        </div>
                        <div id="menu">
                            <ul>
                                <li><a href="index.html">留言首页</a></li>
                                <li><a href="new.html">签写留言</a></li>
								<li><a href="login.html">登陆后台</a></li>
                            </ul>
                        </div>
                   
                </div>
				<div id="mainWrapper">
                    <div id="content" class="content-wide">
                        
							<div class="textbox">
								<div class="textbox-title">
									<h4>签名留言</h4>
								</div>
								<div class="textbox-content">
<li>昵称:
<input name="author" type="text" id="yhm"></li>
<li>标题:
<input name="title" type="text" id="title"></li>

<li>邮箱:
<input name="email" type="text" id="email"></li>
<li>内容:
<textarea name="content" cols="60" rows="10"></textarea></li>
							  </div>
								<div class="textbox-bottom">
								  <input type="submit" name="regsubmit" value="提交" class="btn">
								</div>
							</div>
                      
                    </div>
                </div>
                <div id="footer">
                    <div id="innerFooter">Powered by Tianyitime; Copyright &copy;</div>
                </div>
           
        </div>
</form>
</body>
</html>
