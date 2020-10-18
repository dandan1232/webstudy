<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/24
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" frame="box" align="center" cellpadding="2" cellspacing="2" width="600">
    <tr align="center">
        <td colspan="3" bgcolor="#5f9ea0">用  户  注  册</td>
    </tr>
    <tr>
        <th align="center" rowspan="6"><img src="薛之谦.png" height="280" width="200"></th>
        <td>用户名：</td>
        <td><input type="text" required name="name"><span style="color:red">*</span></td>
    </tr>
    <tr align="left">
        <td>密码：</td>
        <td><input type="password" required name="password"><span style="color:red">*</span></td>
    </tr>
    <tr align="left">
        <td>确认密码：</td>
        <td><input type="password" required name="repassword"><span style="color:red">*</span></td>
    </tr>
    <tr align="left">
        <td>电子邮箱：</td>
        <td><input type="text" required  name="mailbox"><span style="color:red">*</span></td>
    </tr>

    <tr align="left">
        <td>性别：</td>
        <td>
            <input type="radio" name="sex" value="男" checked="checked"/>男
            <input type="radio" name="sex" value="女"/>女<br>
        </td>
    </tr>

    <tr>
        <td></td>
        <td align="left">
        <input type="submit" value="提交">
            <input type="submit" value="重填">
        </td>
    </tr>
</table>
</body>
</html>
