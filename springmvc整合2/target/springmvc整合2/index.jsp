<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/24 0024
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--<a href="Web/sun">跳转测试</a>-->

<br>
<form action="Web/add" method="post">
    账号：<input type="text" name="id" ><br>
    密码：<input type="text" name="password" ><br>
    姓名：<input type="text" name="name" ><br>
    性别：<input type="text" name="sexy" ><br>
    手机：<input type="text" name="phone"><br>
    <input type="submit" value="提交">

</form>

</body>
</html>
