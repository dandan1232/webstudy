<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/16
  Time: 11:07
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
<h3><%=request.getMethod()%>运算已完成！</h3><br>
运算结果为：${requestScope.data}
</body>
</html>
