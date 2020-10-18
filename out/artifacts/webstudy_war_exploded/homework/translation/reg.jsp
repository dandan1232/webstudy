<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/24
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form name="form" method="post" action="change.jsp">
    请选择语言：
    <select name="language"  onChange="this.form.submit()">
        <option value="chinese">---中文---</option>
        <option value="english">---英文---</option>
    </select>
</form>
<%@include file="form.jsp"%>
</body>
</html>
