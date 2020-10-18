<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Response使用例子</title>
<%--   等价 <meta http-equiv="refresh" content="5;URL=https://www.baidu.com"> --%>
</head>
<body>
<%
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    String now=formatter.format(LocalDateTime.now());

    response.setHeader("refresh","5;URL=https://www.baidu.com");
%>
<%=now%>
<br>
5秒之后跳转到百度页面
</body>
</html>
