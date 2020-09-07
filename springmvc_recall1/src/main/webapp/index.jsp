<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/19 0019
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>


    <script type="text/javascript">
        function testjson() {
            var id=$("#id").val();
            var age=$("#age").val();
            alert(id);
            alert(age);
            $.ajax({
                url:"user/testAjax",
                type:"post",
                contentType:"application/json;charset=UTF-8",
                data:JSON.stringify({id:id,age:age}),
                dataType:"json",

                success:function (data) {
                    alert("参数传递成功")
                    if(data!=null)
                        alert("输入合法的数值"+data.age+" "+data.id);

                }
                }

            )

            
        }


    </script>

    <title>Title</title>
</head>
<body>
<a href="hello?username=lin">你好</a>
<a href="user/forword">重定向</a>
<br>
<a href="user/forword">获取ajax请求</a>
<br>
<button id="btn">异步请求</button>
<form>
    账号：<input type="text" name="id" id="id">
    年龄: <input type="text" name="age" id="age">
    <input type="button" value="json交互" onclick="testjson()">
</form>
<br>
<br>
<form action="user/upload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="upload">
    <input type="submit" value="上传">

</form>
<a href="user/error">出错</a>
<br>
<a href="filter/ln">拦截器</a>
</body>
</html>
