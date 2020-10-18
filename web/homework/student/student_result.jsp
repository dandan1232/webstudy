<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/11
  Time: 13:24
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
<jsp:useBean id="student" class="niit.soft.beans.Student"/>
<jsp:setProperty name="student" property="*"/>
姓名：${student.name}<br>
班级：${student.grade}<br>
年龄：${student.age}<br>
男生：${student.boy}
</body>
</html>
