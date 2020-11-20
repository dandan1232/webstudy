<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/18
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="empServlet?action=insert" method="post">
    姓名：<input type="text" name="name"><br>
    工作：<input type="text" name="job"><br>
    工资：<input type="text" name="sal"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
