<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="niit.soft.beans.User" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/4
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${info}

<%
    List<String> list=new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    pageContext.setAttribute("list",list);
    Map<String,String> map=new HashMap<>();
    map.put("key1","value1");
    map.put("key2","value2");
    request.setAttribute("map",map);
    Cookie cookie=new Cookie("niit","南工院");
/*    User user=new User("张三","123");*/
    response.addCookie(cookie);

%>

<h3>迭代输出list数据</h3>
<%--varStatus可以有四个值：index count first last--%>
<c:forEach var="item" items="${list}" step="2" varStatus="id">
  ${id.index}-->  ${item}<br>
</c:forEach>

<h3>迭代输出map数据</h3>
<c:forEach var="item" items="${map}" varStatus="id">
   ${id.count} --> ${item.key}:${item.value}<br>
</c:forEach>
<hr>
获取第二个数据:${list[1]}<br>
获取map中key=key1的数据:${map.key1} ${map["key1"]}<br>
cookie的key和value:
key=${cookie.niit.name} value=${cookie.niit.value}<br>

</body>
</html>
