<%--
  Created by IntelliJ IDEA.
  User: gaoqian
  Date: 2022/04/02
  Time: 12:48:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ATM操作界面</title>
    <style>
        /* body{
             background-image:  url(../../../images/BJ.jpg);

         }*/

        .box {
            width: 100%;
            background: url(../../../../images/BJ.jpg) no-repeat;
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
<div  style="  width: 300px;height: 400px;position:relative ;left: 38%;top: 100px; background-color:rgba(255,255,255,.5)">
    <form method="post" action="/body.do">
        <table style="position: absolute;top: 80px ;border-spacing: 0px 50px">
            <tr>
                <th>用户名:</th>
                <th>
                    <input type="text" placeholder="请输入用户名">
                </th>
            </tr>
            <tr><th>&nbsp</th></tr>
            <tr>
                <th>密&nbsp&nbsp&nbsp&nbsp码:</th>
                <th><input type="password" placeholder="请输入密码"></th>
            </tr>
            <tr><th>&nbsp</th></tr>
            <tr>
                <th>验证码:</th>
                <th><input type="text" placeholder="请输入验证码"></th>
            </tr>
            <tr><th>&nbsp</th></tr>
            <tr>
                <th ><button style="left: 50%" class="layui-btn" lay-submit lay-filter="formDemo">提交</button></th>
                <th align="center" colspan="2">
                    <button class="layui-btn layui-btn-lg layui-btn-normal"><a href="/atm/goPage.do">注册</a> </button>
                    &nbsp&nbsp
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </th>

                <%--<td align="center"><input type="submit" value="提交"><input type="reset" value="重置"> </td>--%>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
