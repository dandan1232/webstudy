<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/4
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>调查问卷</h3>
<form action="doSearch.jsp">
    姓名：<input type="text" name="name"><br>
    爱好: <input type="checkbox" name="hobby" value="sing">唱歌
    <input type="checkbox" name="hobby" value="dancing">跳舞
    <input type="checkbox" name="hobby" value="reading">阅读
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
