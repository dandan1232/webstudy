<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // response.sendRedirect("requestDemo01.jsp");
    //创建Cookie对象
    Cookie c1 = new Cookie("NJUIT", "南工");
    //设置Cookie对象的保存时间，以秒为单位
    c1.setMaxAge(60);
    //向客户端增加Cookie
    response.addCookie(c1);

    Cookie c[] = request.getCookies();
    for (int i = 0; i < c.length; i++) {
        out.print(c[i].getName() + "--->" + c[i].getValue() + "<br>");
    }
    session.invalidate();
    out.println("sessionId=" + session.getId() + "<br>");
%>
</body>
</html>
