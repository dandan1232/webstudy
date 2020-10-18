<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/7
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="bean_result.jsp" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    性别：<input type="radio" name="boy" value="true">男
    <input type="radio" name="boy" value="flase">女
    <input type="submit" value="提交">
</form>
</body>
</html>
