<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/6
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set value="30" var="num"/>

<c:choose>
    <c:when test="${num>50}">num数据值大于50</c:when><%--可以重复一次或多次--%>
    <c:when test="${num>=30}">${num}num数据值大于等于30</c:when>
    <c:otherwise>num数据值小于30</c:otherwise><%--出现0次或1次，并且放在最后--%>
</c:choose>
<hr>

<h4>字符串拆分</h4>
<c:set var="str" value="a123，bb12cc，dd，ee-ff"/>
<c:out value="分隔字符串${str}结果："/>
<c:forTokens items="${str}" delims="， -" var="item">
    ${item} &nbsp;&nbsp;&nbsp;
</c:forTokens>
<c:redirect url="doSearch.jsp">
    <c:param name="name" value="李四"/>
</c:redirect>
</body>
</html>
