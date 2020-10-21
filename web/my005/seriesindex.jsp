<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/21
  Time: 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算等差数列或等比数列的和</title>
</head>
<body>
<form action="seriesDemo" method="post">
    等差数列求和:<br>
    首项：<input type="text" name="firstItem" size="5">
    公差：<input type="text" name="var" size="5">
    项数：<input type="text" name="num" size="5">
    <input type="submit" value="提交">
</form>

<form action="seriesDemo" method="get">
    等比数列求和:<br>
    首项：<input type="text" name="firstItem" size="5">
    等差：<input type="text" name="var" size="5">
    项数：<input type="text" name="num" size="5">
    <input type="submit" value="提交">
</form>
</body>
</html>
