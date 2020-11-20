<%--
  Created by IntelliJ IDEA.
  User: zhouyulin
  Date: 2020/11/20
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>


<%@ page import="edu.gd.mvnapp.dao.StudentDao" %>
<%@ page import="edu.gd.mvnapp.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: thyme
  Date: 2020/10/31
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
</head>
<body>

<table id="demo" lay-filter="test"></table>

<script src="/layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/stu/all/' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'name', title: '用户名', width:80}
                ,{field: 'sex', title: '性别', width:80, sort: true}
                ,{field: 'phone', title: '电话号码', width: 80, sort: true}
                ,{field: 'mail', title: '电子邮箱', width: 80}

            ]]
        });

    });
</script>
</body>
</html>