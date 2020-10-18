<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接收参数</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String[] inst = request.getParameterValues("inst");

    //一次性或许所有的参数
    Enumeration enu = request.getParameterNames();
    while (enu.hasMoreElements()) {
        out.println("参数名" + (String)enu.nextElement()+"<br>");
    }

%>
姓名：<%=name%><br>
爱好：
<%
    if (inst != null) {
        for (int i = 0; i < inst.length; i++) {
%>
<%=inst[i]%>&nbsp;&nbsp;
<%
        }
    } else {
        out.println("无");
    }
%>
</body>
</html>
