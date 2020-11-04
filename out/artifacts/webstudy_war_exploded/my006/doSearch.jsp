<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/4
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>调查问卷结果</h3>
姓名：${param.name}
<br>
爱好：${paramValues.hobby[0]} ${paramValues.hobby[1]} ${paramValues.hobby[2]}

</body>
</html>
