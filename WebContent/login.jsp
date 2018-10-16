<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />

<link rel="stylesheet" type="text/css" href="css/style.css" />


<title>login</title>
</head>
<body background="image/dc.jpg" style="text-align: center;">
	<div class="header">

		<div class="header-bottom">
			<div class="container">
				<div class="logo">
					<a href="http://www.baidu.com/index.html"> <img
						src="image/logo.png" style="height: 55px; width: 200px"></a>
				</div>
				<div class="top-nav">
					<span class="menu"></span>
					<ul>
						<li><a href="index.jsp" class="scroll">首页</a></li>
						<li><a href="mypro.html" class="scroll">自序</a></li>
						<li><a href="https://www.baidu.com/" class="scroll">Idea</a></li>
						<li><a href="https://www.baidu.com/" class="scroll">学习</a></li>
						<li><a href="https://www.baidu.com/" class="scroll">推荐</a></li>
						<li><a href="regist.jsp" class="scroll">注册</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="login-form">
		<form action="${pageContext.request.contextPath }/LoginServlet"
			method="post" onsubmit="return check()">
			<input type="text" class="text" id="uname" name="username"
				value="用户名" onfocus="this.value = '';"
				onblur="if (this.value == '') {this.value = '用户名';}">
			<div class="key">
				<input type="password" value="Password" id="passwd" name="password"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'password';}">
			</div>

			<input type="submit" value="登录" onclick="check()" />


		</form>
	</div>
	<div class="header-top">

		<ul>
			<li><a href="mailto:18093432573@163.com"><span></span>18093432573@163.com</a></li>
		</ul>
	</div>
	<div class="clearfix"></div>
</body>
</html>
