<%@ page import="niit.soft.beans.User" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/7
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    out.print("tomact已经启动了嗷，欢迎~");
    User user=new User("张三","123");
    User user01=new User("李四","123");
    session.setAttribute("user",user);
    session.setAttribute("user",user01);
    session.removeAttribute("user");
    %>
  </body>
</html>
