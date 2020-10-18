<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/16
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
提示：用英文模式下的;分隔两个数字哦~<br>
<h3>post（求和）</h3>
<form action="sumOrProduct" method="post">
<input type="text" name="data"><br>
<input type="submit" value="求和">
</form>

<h3>get（求积）</h3>
<form action="sumOrProduct" method="get">
    <input type="text" name="data"><br>
    <input type="submit" value="求积">
</form>
</body>
</html>
