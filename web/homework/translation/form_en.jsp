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
        <td colspan="3" bgcolor="#5f9ea0">Create an Accout</td>
    </tr>
    <tr>
        <th align="center" rowspan="6"><img src="薛之谦.png" height="280" width="200"></th>
        <td>Account：</td>
        <td><input type="text" required name="name"><span style="color:red">*</span></td>
    </tr>
    <tr align="left">
        <td>Password：</td>
        <td><input type="password" required name="password"><span style="color:red">*</span></td>
    </tr>
    <tr align="left">
        <td>Confirm Password：</td>
        <td><input type="password" required name="repassword"><span style="color:red">*</span></td>
    </tr>
    <tr align="left">
        <td>E-mail Address：</td>
        <td><input type="text" required name="mailbox"><span style="color:red">*</span></td>
    </tr>

    <tr align="left">
        <td>Sex：</td>
        <td>
            <input type="radio" name="sex" value="Male" checked="checked"/>Male
            <input type="radio" name="sex" value="Female"/>Female<br>
        </td>
    </tr>

    <tr>
        <td></td>
        <td align="left">
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </td>
    </tr>
</table>
</body>
</html>
