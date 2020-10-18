<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用request对象获取参数</title>
</head>
<body>
<form action="requestDemo02.jsp" method="post">
    姓名：<input type="text" name="name" placeholder="aaa"><br>
    爱好：<input type="checkbox" name="inst" value="swiming" checked> swimming
    <input type="checkbox" name="inst" value="reading">reading
    <input type="checkbox" name="inst" value="jogging">jogging
    <br>
    <input type="submit" value="提交">
</form>

</body>
</html>
