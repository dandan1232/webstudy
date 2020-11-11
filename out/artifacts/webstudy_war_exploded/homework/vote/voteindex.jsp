<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/6
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>投票啦！</title>
</head>
<body>
<form action="doVote" method="post">
    <h2>投票程序</h2>
    <h3>最强法王，我选：</h3>
    <input type="radio" name="item" value="上官">上官<br>
    <input type="radio" name="item" value="小乔">小乔<br>
    <input type="radio" name="item" value="甄姬">甄姬<br>
    <input type="radio" name="item" value="妲己">妲己<br>
    <input type="radio" name="item" value="貂蝉">貂蝉<br>
    <input type="submit" value="我选她">
    <input type="button" value="查看投票结果" onclick="window.location.href='VoteResult.jsp'">
</form>
</body>
</html>
