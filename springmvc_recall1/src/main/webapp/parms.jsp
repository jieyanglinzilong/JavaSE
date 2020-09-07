<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/19 0019
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="haha/mn?username=hehe">参数绑定入门</a>
<form action="haha/save" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    金额：<input type="text" name="money"><br>
    单号:<input type="text" name="user.id"><br>
    年龄：<input type="text" name="user.age">
    <input type="submit" value="提交">
</form>



</body>
</html>
