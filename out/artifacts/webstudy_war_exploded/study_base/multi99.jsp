<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/16
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="80%">
    <caption>九九乘法口诀表</caption>
    <%
        int i = 9, j = 9;
        for (int m = 1; m <= i; m++) {
    %>
    <tr>
        <%
            for (int n = 1; n <= m; n++) {
                //输出m*n的数据及结果
        %>
        <td><%=m%>*<%=n%>=<%=m * n%> &nbsp;&nbsp;&nbsp;</td>
        <%
                }//换行操作
            }
        %>
    </tr>
</table>
</body>
</html>