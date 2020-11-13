<%--
  Created by IntelliJ IDEA.
  User: zhouyulin
  Date: 2020/11/1
  Time: 08:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        int i = 17;
        int result;
    %>
    <%
        switch (result = i % 7){
        case 0:
    %>
    <h1>Today is Sunday!</h1>
    <%
        break;
        case 1:
    %>
    <h2>Today is Monday!</h2>
    <%
        break;
        case 2:
    %>
    <h1>Today is Tuesday!</h1>
    <%
        break;
        case 3:
    %>
    <h1>Today is Wednesday!</h1>
    <%
        break;
        case 4:
    %>
    <h1>Today is Thursday!</h1>
    <%
        break;
        case 5:
    %>
    <h1>Today is Friday!</h1>
    <%
        break;
        case 6:
    %>
    <h1>Today is Saturday!</h1>
    <%
        break;}
    %>

</body>
</html>
