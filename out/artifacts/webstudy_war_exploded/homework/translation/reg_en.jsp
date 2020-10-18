<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/24
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create an Account</title>
</head>
<body>
<form name="form" method="post" action="change.jsp">
    Please choose the language：
    <select name="language"  onChange="this.form.submit()">
        <option value="english">---English---</option>
        <option value="chinese">---Chinese---</option>
    </select>
</form>
<%@include file="form_en.jsp"%>
</body>
</html>
