<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/17 0017
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<a href="anno/testRequestParm?username=周旋">RequestParm测试</a>
<br/>
<form action="anno/testRequestBody" method="post">

    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    日   期： <input type="text" name="date"/><br/>

    <input type="submit" value="提交"/>
</form>
</body>
</html>
<br/>
<a href="anno/testPathVarible/10">PathVarible测试</a>
<br/>
<form action="anno/testModleAttribute" method="post">

    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    日   期： <input type="text" name="date"/><br/>

    <input type="submit" value="提交"/>
</form>
<br/>
<a href="anno/testSeesionAttributes">SeesionAttributes测试</a>