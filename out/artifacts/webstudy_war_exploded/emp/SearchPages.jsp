<%@ page import="jdbcDemo.bean.Emp" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/22
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>show</title>
    <meta name="viewport" content="width=device-width,initialcale=1">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>
<%--<jsp:useBean id="pagination" class="jdbcDemo.util.MyPagination" scope="session"/>
<%
    String str = request.getParameter("Page");
    int Page = 1;
    int pageSize = 5;
    List<Emp> empList = (List) session.getAttribute("emplist");
    int len = empList.size();

    if (str == null) {
        empList = pagination.getInitPage(empList, Page, pageSize);
    } else {
        Page = pagination.getPage(str);
        empList = pagination.getAppointPage(Page);
    }
    pageContext.setAttribute("emplist", empList);
%>--%>
<body>
<header>
    <a href="index.jsp">
        <img src="${avatar}" width="60" height="60" style="margin: 25px 45%">
    </a>
</header>
<%--<div class="navbar navbar-dark navbar-brand">--%>
<div class="container">
    <table class="table table-hover table-striped">
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>工作</th>
            <th>工资</th>
            <th>操作一</th>
            <th>操作二</th>
        </tr>

<%--        <c:forEach items="${emplist}" var="emp">--%>
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.job}</td>
                <td>${emp.sal}</td>
                <td><a href="empServlet?action=deleteById&id=${emp.id}">删除</a></td>
                <td><a href="EmpUpdate.jsp?id=${emp.id}">修改信息</a></td>
<%--                <td><a href="empServlet?action=Update&id=${emp.id}">修改</a></td>--%>
            </tr>
<%--        </c:forEach>--%>
    </table>
</div>
<%--<%=pagination.printCtrl(Page)%>--%>
<br>
<footer>
    <h3 align="center"><a href="index.jsp">返回</a></h3>
</footer>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
        integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>
</body>
</html>

