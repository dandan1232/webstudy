<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/7
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="p" class="niit.soft.beans.Person"/>
<jsp:setProperty name="p" property="*"/>
姓名：${p.name}<br>
年龄：${p.age}<br>
男生：${p.boy}

</body>
</html>
