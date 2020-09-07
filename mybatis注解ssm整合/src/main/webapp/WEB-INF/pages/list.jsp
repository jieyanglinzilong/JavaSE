<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/20 0020
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询成功</title>
</head>
<body>


<c:forEach items="${list}" var="user">
    ${user.name} <br/>
</c:forEach>
</body>
</html>
