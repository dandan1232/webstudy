<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/4
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("info", "page范围");
    request.setAttribute("info", "request范围");
    session.setAttribute("info", "session范围");
    application.setAttribute("info", "application范围");
%>

    info=${info}<br>
    infor=${applicationScope.info}
    <a href="elDemo02.jsp">查看</a>
<%--    <jsp:forward page="elDemo02.jsp"/>--%>
    <h3>通过EL来接收参数:${param.name}</h3>
</body>
</html>
