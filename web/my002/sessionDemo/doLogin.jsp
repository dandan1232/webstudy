<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 10:51
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
    String name = request.getParameter("name");
    String psd = request.getParameter("psd");
    if (name != null && psd != null && name.equals(psd)) {
        session.setAttribute("user", name);
        response.setHeader("refresh", "2;url=welcome.jsp");
        out.println("用户名和密码正确，即将转跳到欢迎页面！");
    }else{
        response.setHeader("refresh","3;url=login.jsp");
        out.println("用户名或者密码错误，即将返回到登录页界面");
    }
%>
</body>
</html>
