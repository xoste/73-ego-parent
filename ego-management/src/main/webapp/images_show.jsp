<%--
  Created by IntelliJ IDEA.
  User: Xoste
  Date: 2020/12/9
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
	<title>后台</title>
</head>
<body>
<table border="2">
	<thead>
	<tr>
		<td>编号</td>
		<td>图片</td>
		<td>操作</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${imagesList}" var="images">
		<tr>
			<td>${images.id }</td>
			<td><img src="${pageContext.request.contextPath}/files/${images.path }" width="60px" alt="图片加载失败"/></td>
			<td><a href="${pageContext.request.contextPath}/delete?id=${images.id}">删除</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
${requestScope.success}
${requestScope.error}
</body>
</html>
