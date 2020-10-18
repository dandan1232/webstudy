<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/11
  Time: 14:47
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
<jsp:useBean id="calculate" class="niit.soft.beans.Calculate"/>
<jsp:setProperty name="calculate" property="*"/>
第一个数字：${calculate.numberOne}<br>
第二个数字：${calculate.numberTwo}<br>
运算已完成！
运算结果：${calculate.result}

</body>
</html>