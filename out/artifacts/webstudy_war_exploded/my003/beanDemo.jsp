<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/7
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="p" class="niit.soft.beans.Person"/>
<jsp:setProperty name="p" property="*"/>
<jsp:setProperty name="p" property="name" value="李四"/>
姓名：${p.name}<br>
年龄：${p.age}<br>
是否男孩：<jsp:getProperty name="p" property="boy"/>

</body>
</html>
