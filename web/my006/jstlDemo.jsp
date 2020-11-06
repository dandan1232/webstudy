<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/4
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%
    request.setAttribute("info","NIIT");
%>--%>
<%--等价上面的语句--%>
<c:set var="info" value="NIIT" scope="request"/>
<%--等价下面的语句--%>
<c:set var="info" scope="request">
    NIIT
</c:set>
<jsp:useBean id="user" class="niit.soft.beans.User" scope="request">
    <c:set  value="张三" target="${user}" property="account"/>
    user对象的account为:<c:out value="${user.account}"/>
    <c:catch var="errorMsg">
        <c:set value="羊山北路1号" target="${user}" property="address"/>
    </c:catch>
    <c:if test="${not empty errorMsg}" var="result" scope="page">
    <h3>异常信息：${errorMsg}</h3>  ${result}
    </c:if>
    <c:if test="${10 lt 30}" var="result1"/>
    <h4>10小于30的结果为：${result}</h4>

    <%--删除标签--%>
    <c:remove var="user"/>
    删除后:<br>
    user对象的account为:<c:out value="${user.account}"/>
    <hr>
</jsp:useBean>
<%--语法：<c:out value="需要打印的内容" default="默认值" [escapeXml=true|false]/>--%>
<c:out value="${info}" default="无数据值"/><br>
<%--<c:out>的第二种方式--%>
<c:out value="${info}">
    info无数据值
</c:out>
<%--如果aaa不存在，则输出下面的代码行--%>
<c:out value="${aaa}" escapeXml="true">
    <meta http-equiv="refresh" content="3;url=https://www.baidu.com">
</c:out>
<%--如果aaa不存在，则发生跳转--%>
<c:out value="${aaa}" escapeXml="false">
    <meta http-equiv="refresh" content="3;url=https://www.baidu.com">
</c:out>

<c:out value="<hr>"escapeXml="false"></c:out>
</body>
</html>
