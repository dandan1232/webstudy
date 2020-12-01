<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/22
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<%
    String id=request.getParameter("id");
    String name=request.getParameter("name");
%>
<h2>编号:<%=id%></h2>
<h2>姓名:<%=name%></h2>

<form action="empServlet?action=update$id=<%=id%>" method="post">
    姓名:<input type="text" name="name"><br>
    工作:<input type="text" name="job"> <br>
    工资:<input type="text" name="sal"><br>
    <input type="submit" value="提交">

</form>
</body>
</html>
