<%--
  Created by IntelliJ IDEA.
  User: gaoqian
  Date: 2022/04/02
  Time: 19:11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>欢迎注册</title>
    <style>
        .box {
            width: 100%;
            background: url(../../../../images/reg.png) no-repeat;
            background-size: 100% 100%;
            position: absolute;
            z-index: -1;
            top: 0;
            left: 2px;
            right: 2px;
        }
    </style>
    <link rel="stylesheet" href="../../../../layui/css/layui.css">
    <link rel="stylesheet" href="../../../../layui/css/layui.css">
    <link rel="stylesheet" href="../../../../layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../../../../layui/css/layui.css" media="all">
    <script src="../../../../js/jquery-3.6.0/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="../../../../layui/css/adminLogin.css">
</head>
<body class="box">
<div style="  width: 300px;height: 400px;position:relative ;left: 38%;top: 100px; background-color:rgba(255,255,255,.5)">
    <form method="post" action="/atm/register.do" >
        <table style="position: absolute;top: 80px ;border-spacing: 0px 50px">
            <tr>
                <th>用户名:</th>
                <th>
                    <input type="text" id="userName" name="userName" placeholder="请输入用户名">
                </th>
            </tr>
            <tr>
                <th>&nbsp</th>
            </tr>
            <tr>
                <th>密&nbsp&nbsp&nbsp&nbsp码:</th>
                <th><input type="password" id="passWord" name="passWord" placeholder="请输入密码"></th>
            </tr>

            <tr>
                <th>&nbsp</th>
            </tr>
            <tr>
                <th align="center" colspan="2">
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    <button style="left: 50%" class="layui-btn lay-submit" lay-filter="formDemo" onclick="checkForm()">注册</button>
                    <button class="layui-btn layui-btn-lg layui-btn-normal"><a href="/atm/main.do">登录</a> </button>

                </th>

                <%--<td align="center"><input type="submit" value="提交"><input type="reset" value="重置"> </td>--%>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">
  function checkForm() {
      if (document.getElementById("userName").value ===''){
          alert("用户名不能为空")
          return false;
      }
      if (document.getElementById("passWord").value ===''){
          alert("密码不能为空")
          return false;
      }


  }
</script>
</body>
</html>
