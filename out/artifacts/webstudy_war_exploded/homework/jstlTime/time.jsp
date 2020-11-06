<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/6
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:set value="now" var="hour"/>--%>
<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
现在时间是：${date.hours}时${date.minutes}分${date.seconds}秒 &nbsp
<c:set var="date.hours"/>
<br>
<c:choose>
    <c:when test="${ date.hours>0 && date.hours<10}">早上好，打工人</c:when>
    <c:when test="${ date.hours>10 && date.hours<12}">中午好，老板</c:when>
    <c:when test="${ date.hours>12&& date.hours<19}">下午好，富家子弟</c:when>
    <c:when test="${date.hours>19&& date.hours<22}">傍晚好，归家人</c:when>
    <c:otherwise>晚上好,秃头人</c:otherwise>
</c:choose>
</body>
</html>
