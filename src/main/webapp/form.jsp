<%--
  Created by IntelliJ IDEA.
  User: zhouyulin
  Date: 2020/11/1
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="layui/css/layui.css" rel="stylesheet">
</head>
<body>
<h2>验证信息</h2>
<form class="layui-form" action="index.jsp" method="get">
<div class="layui-form-item">
    <div class="layui-inline">
        <label class="layui-form-label">验证手机</label>
        <div class="layui-input-inline">
            <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">验证邮箱</label>
        <div class="layui-input-inline">
            <input type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
        </div>
    </div>
</div>
<div class="layui-form-item">
    <div class="layui-input-block">
        <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
</div>
</form>
<script src="layui/layui.all.js"></script>
</body>

</html>
