<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/11
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="calculate_result.jsp" method="post">
    请输入第一个数字：<input type="text" name="numberOne"><br>
    请输入第二个数字：<input type="text" name="numberTwo"/><br>
    &nbsp&nbsp请选择运算法则：&nbsp<select name="way" >
    <option>--------请选择--------</option>
    <option  value="1">加法（+）</option>
    <option  value="2">减法（-）</option>
    <option  value="3">乘法（*）</option>
    <option  value="4">除法（/）</option>
</select>
    <input type="submit" value="提交">
</form>
</body>
</html>

