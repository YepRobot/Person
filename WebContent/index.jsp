<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>my person page </title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="js/jquery.min.js"></script>
    
    
    <link rel="icon" href="image/stu.png" type="image/x-icon" />

    <link rel="shortcut icon" href="image/stu.png" type="image/x-icon" />

    <link rel="bookmark" href="image/stu.png" type="image/x-icon" />

    <!--e8edd9-->
</head>

<body background="image/dc.jpg">
    <div class="header">
        
        <div class="header-bottom">
            <div class="container">
                <div class="logo">
                    <a href="http://www.baidu.com/index.html">
                        <img src="image/logo.png" style="height: 55px;width: 200px"></a>
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
                        <li><a href="upload.jsp" class="scroll">推荐</a></li></c:when>
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
    
    
 <div class="header-top">
            
                <ul>
                    <li><a href="mailto:18093432573@163.com"><span></span>18093432573@163.com</a></li>
                </ul>
            </div>
            <div class="clearfix">
           
        </div>
    

</body>

</html>