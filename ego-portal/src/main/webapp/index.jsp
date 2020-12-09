<%--
  Created by IntelliJ IDEA.
  User: Xoste
  Date: 2020/12/9
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
	<title>前台</title>
</head>
<body>
<c:forEach items="${imagesList}" var="images">
	<img src="${images.path }" width="200px" height="100px" alt="图片加载失败"/>
</c:forEach>
</body>
</html>
