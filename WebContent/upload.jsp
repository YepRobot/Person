<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="icon" href="image/stu.png" type="image/x-icon" />

    <link rel="shortcut icon" href="image/stu.png" type="image/x-icon" />

    <link rel="bookmark" href="image/stu.png" type="image/x-icon" />
<title>推荐</title>
</head>
<body background="image/dc.jpg" style="text-align: center;">
<h1>文件上传</h1>
<form method="post" action="${pageContext.request.contextPath }/UploadServlet" enctype="multipart/form-data">
    选择一个文件:
    <input type="file" name="uploadFile" />
    <br/><br/>
    <input type="submit" value="上传" />
    <input type="button" class="clickbutton" value="返回" onclick="window.history.back();" />
</form>
</body>
</html>