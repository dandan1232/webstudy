<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/23
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //获取客户端提交的方法
    String method=request.getMethod();
    //获取客户端IP地址
    String ip=request.getRemoteAddr();
    //获取访问路径
    String path1=request.getServletPath();
    //获取上文名称
    String path2=request.getContextPath();
    //获取当前文件的绝对路径
    String path3=pageContext.getServletContext().getRealPath("/");
    //获取请求路径
    String path4=request.getRequestURI();
    String path5=request.getRequestURL().toString();

%>
<h3>method=<%=method%></h3>
<h3>ip=<%=ip%></h3>
<h3>访问路径：<%=path1%></h3>
<h3>上下文路径：<%=path2%></h3>
<h3>当前文件路径：<%=path3%></h3>
<h4>请求路径：<%=path4%></h4>
<h3><%=path5%></h3>
</body>
</html>
