<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/20 0020
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm整合初尝试</title>
</head>
<body>
<a href="account/findAll">测试查询</a>
<br/>
<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存"/><br/>
</form>
<br/>
<a href="account/del">删除查询</a>
<br/>
<a href="user/find">用户查询</a>
</body>
</html>
