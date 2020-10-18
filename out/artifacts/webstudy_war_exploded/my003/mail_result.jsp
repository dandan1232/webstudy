<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/14
  Time: 9:55
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
<jsp:useBean id="myEmail" type="niit.soft.beans.Email"/>
<jsp:setProperty name="myEmail" property="mailAdd"/>
${myEmail.mailAdd}是否合格：${myEmail.email}
</body>
</html>
