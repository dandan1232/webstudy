<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020-9-18
  Time: 11:35
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
    /*获取session属性范围的数据值*/
    String name=(String)application.getAttribute("name");
    Integer age=(Integer)application.getAttribute("age");
%>
<%--输出属性值--%>
<h2>姓名：<%=name%></h2>
<h2>年龄：<%=age%></h2>
</body>
</html>
