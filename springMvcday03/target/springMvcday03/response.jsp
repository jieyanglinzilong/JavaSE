<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/19 0019
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function(){
            $("#btn").click(function(){
                //alert("hello btn");
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"hehe","password":"123","age":30}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });

            });
        });

    </script>



</head>

<body>
<a href="user/testString">testString</a>
<br/>
<a href="user/testvoid">返回值为void测试</a>
<br/>
<a href="user/testModel">返回值为mold值测试</a>


<br/>

<button id="btn">发送ajax请求</button>

<br/>
<form action="user/fileupload2"method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传">


</form>

</body>
</html>
