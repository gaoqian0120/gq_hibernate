<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/05
  Time: 22:03:46
  To change this template use File | Settings | File Templates.
--%>
v<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.msg}
${name }
<h3>msg数据  ${msg}</h3>
<h3>fun数据  ${fun}</h3>
</body>
</html>
