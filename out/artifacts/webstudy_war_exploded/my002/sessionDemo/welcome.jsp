<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (session.getAttribute("user") != null) {
%>
欢迎<%=session.getAttribute("user")%>登录本系统！！
<a href="login.jsp">注销</a>
<%
    } else {
        response.sendRedirect("login.jsp");
    }
%>

</body>
</html>
