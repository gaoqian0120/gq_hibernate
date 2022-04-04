<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/05
  Time: 22:03:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body{
            background-image:  url(../../images/login.jpg);
            background-size:cover;
        }
    </style>
</head>
<%--<body &lt;%&ndash;style="background-image:  url(../../images/login.jpg)"&ndash;%&gt;>
${requestScope.msg}
${name }
<h3>msg数据  ${msg}</h3>
<h3>fun数据  ${fun}</h3>
</body>--%>



<body>
注册界面. <br>

<script type="text/javascript">
    function myfunction()
    {
        if(document.getElementById("username").value=='')
        {
            alert("用户名不能为空");
            return false;
        }
        if(document.getElementById("password").value=='')
        {
            alert("密码不能为空");
            return false;
        }
        if(document.getElementById("email").value=='')
        {
            alert("邮箱不能为空");
            return false;
        }

        return true;
    }
</script>

<form action="/index/login.do" method="post" >
    名字:<input type="text" name="username"  id="username"/><br>
    密码:<input type="text" name="password" id="password"/><br>
    邮箱:<input type="text" name="email" id="email"/><br>
    验证码:<input type="text" name="yanzhengma" id="yanzhengma"/>
    <img src="../../../images/a.png"><br/>
    <input type="submit" value="注册" onclick="return  myfunction()"/>
</form>
<div style="width: 20px;height: 10px">
    <h2><a href="/index/login.do">/index/login.do</a></h2>
</div>
</body>
</html>
