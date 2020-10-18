<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/18
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接收参数并显示</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
<%--获取参数方式--%>
<h1>姓名：<%=request.getParameter("name")%></h1>
<h2>年龄：<%=request.getParameter("age")%></h2>
</body>
</html>
