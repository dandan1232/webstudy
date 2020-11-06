<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/4
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${user.name}<br>

${user["My-Name"]}<br>

${10+2}<br>
${10-2}<br>
${10*2}<br>
${10/4}<br>或${10 div 4}<br>
${10%4} 或 ${10 mod 4}<br>

${10==2} 或${10 eq 2}<br>
${10!=2} 或${10 ne 2}<br>
${10<2} 或${10 lt 2}<br>
${10>2} 或${10 gt 2}<br>
${10<=2}或${10 le 2}<br>
${10>=2}或 ${10 ge 2}<br>

${true&&false}<br>
${true||false}<br>
${!true}<br>

${ param.password1 ==param.password2 }<br>

${empty name}<br>

${ (1==2)? 2 : 4}<br>

${2*(3+4)}<br>

</body>
</html>
