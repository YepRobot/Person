<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>学生管理</title>
<script type="text/javascript">
    function editMethod(user_ID) {
    	 location.href="${pageContext.request.contextPath }/StuDetailsServlet?user_ID="+user_ID;
	}
</script>

</head>


<body background="image/serchBack.jpg">
	<div class="header">

		<div class="header-bottom">
			<div class="container">
				<div class="logo">
					<a href="http://www.gsut.edu.cn"> <img
						src="image/logo.png" style="height: 55px; width: 200px"></a>
				</div>
				<div class="top-nav">
					<span class="menu"></span>
					 <ul>
                        <li><a href="index.jsp" class="scroll">首页</a></li>
                        <c:choose>
                         <c:when test = "${user.user_Power==1}">
                         <li><a href="${pageContext.request.contextPath }/SerchStuServlet" class="scroll">学生管理</a></li>
                        </c:when>
                        <c:when test="${user.user_Power==2}">
                        <li><a href="https://www.baidu.com/" class="scroll">我的大学</a></li>
                        </c:when>
                        </c:choose>
                        <li><a href="ideas.jsp" class="scroll">Idea</a></li>
                        <li><a href="https://www.baidu.com/" class="scroll">学习</a></li>
                        <c:choose>
                      <c:when test = "${user.user_Power==1}"> 
                        <li><a href="https://www.baidu.com/" class="scroll">推荐</a></li></c:when>
                        </c:choose>
                        <li><a href="https://www.baidu.com/" class="scroll">收藏夹</a></li>
                        <li style="color: black">&nbsp 欢迎 ${user.user_Name } <c:choose>
                        <c:when test = "${user.user_Power==1}">老师</c:when>
					    <c:when test = "${user.user_Power==2}">同学</c:when>
                        </c:choose>
                        
                        </li>
                        <li><a href="login.jsp" class="scroll">退出系统</a></li>
                    </ul>
				</div>
			</div>
		</div>
	</div>
	<div class="serchStu-form">
		<table class="listtable">
			<caption>所有学生:</caption>
			<tr class="listheader">
				<th>序号</th>
				<th>学号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>性别</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${users }" var="user" varStatus="st">
				<tr>
					<td>${st.count }</td>
					<!--st.count: 1,2,... st.index : 0,1,2,.... -->
					<td id="userID${user.user_ID }">${user.user_ID }</td>
					<td id="userName${user.user_ID }">${user.user_Name }</td>
					<td id="userAge${user.user_ID }">${user.user_Age }</td>
					<td id="userGender${user.user_ID }">
					<c:choose>
					<c:when test = "${user.user_Gender==0}">女</c:when>
					<c:when test = "${user.user_Gender==1}">男</c:when>
					</c:choose>
					</td>
					<td>
					 <a class="clickbutton" id="editBtn${user.user_ID }" 
	                            href="javascript:editMethod(${user.user_ID })" >查看详情</a>
	                           
					</td>
					
				</tr>
			</c:forEach>
		</table>
	</div>





	<div class="header-top">

		<ul>
			<li><a href="mailto:18093432573@163.com"><span></span>18093432573@163.com</a></li>
		</ul>
	</div>
	<div class="clearfix"></div>


</body>

</html>
