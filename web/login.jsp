<%--
  Created by IntelliJ IDEA.
  User: 星海
  Date: 2019/7/15
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<marquee width="200" scrolldelay="250">用户登录</marquee>
<form action="loginServlet" method="GET">
    用户名：<input type="text" name="username" id="username2" /><br/>
    密码：<input type="password" name="password" id="pwd"/><br/>
    <input type="submit" value="登录"/>
    <input type="submit" value="注册" />
</form>
</body>
</html>
