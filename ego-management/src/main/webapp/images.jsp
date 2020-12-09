<%--
  Created by IntelliJ IDEA.
  User: Xoste
  Date: 2020/12/9
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
	<title>后台</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/insert" enctype="multipart/form-data" method="post">
	文件：<input type="file" name="file"><br/>
	<input type="submit" value="上传">
</form>
</body>
</html>
