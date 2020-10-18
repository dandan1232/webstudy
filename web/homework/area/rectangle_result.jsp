<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/11
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="rectangle" class="niit.soft.beans.Rectangle"/>
<jsp:setProperty name="rectangle" property="*"/>
<body>
长：${rectangle.height}<br>
宽：${rectangle.width}<br>
矩形的面积为：<%=rectangle.Area(rectangle.getHeight(),rectangle.getWidth())
%>
</body>
</html>
