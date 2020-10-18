<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.invalidate();
    response.sendRedirect("login.jsp");
%>
<h3>如果没有发生跳转到首页，请点击 <a href="login.jsp"> 这里</a> </h3>
</body>
</html>