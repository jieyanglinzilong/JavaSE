<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/16 0016
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数绑定</title>
</head>
<body>

<!--
<form action="parms/saveAccount" method="post">
    姓名：    <input type="text" name="username"/><br/>
    密码：    <input type="text" name="password"/><br/>
    金额：    <input type="text" name="money"/><br/>
    用户姓名：<input type="text" name="user.uname"/><br/>
    用户年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" value="提交"/>
</form>-->
<!--
<form action="parms/saveAccount" method="post">
    姓名：    <input type="text" name="username"/><br/>
    密码：    <input type="text" name="password"/><br/>
    金额：    <input type="text" name="money"/><br/>
    用户姓名：<input type="text" name="list[0].uname"/><br/>
    用户年龄：<input type="text" name="list[0].age"/><br/>
    日期    ：<input type="text" name="list[0].date"/><br/>
    用户姓名：<input type="text" name="amp['one'].uname"/><br/>
    用户年龄：<input type="text" name="amp['one'].age"/><br/>
    日期    ：<input type="text" name="amp.['one'].date"/><br/>
    <input type="submit" value="提交"/>
</form>-->
<form action="parms/saveUser" method="post">

    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    日   期：<input type="text" name="date"/><br/>

    <input type="submit" value="提交"/>
</form>


</body>
</html>
