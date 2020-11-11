<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/6
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h2>投票结果显示</h2>
<table>
    <tr>
        <td align="right">上官：</td>
        <td>
            <img src="green.png" height="10" width="${300*VoteResult["上官"]/
            (VoteResult["小乔"]+VoteResult["甄姬"]+VoteResult["妲己"]+VoteResult["貂蝉"])}/">
        </td>
        <td>(${empty VoteResult["上官"]?0:VoteResult["上官"]})</td>
    </tr>

    <tr>
        <td align="right">小乔：</td>
        <td>
            <img src="green.png" height="10" width="${300*VoteResult["小乔"]/
            (VoteResult["上官"]+VoteResult["甄姬"]+VoteResult["妲己"]+VoteResult["貂蝉"])}/">
        </td>
        <td>(${empty VoteResult["小乔"]?0:VoteResult["小乔"]})</td>
    </tr>

    <tr>
        <td align="right">甄姬：</td>
        <td>
            <img src="green.png" height="10" width="${300*VoteResult["甄姬"]/
            (VoteResult["上官"]+VoteResult["小乔"]+VoteResult["妲己"]+VoteResult["貂蝉"])}/">
        </td>
        <td>(${empty VoteResult["甄姬"]?0:VoteResult["甄姬"]})</td>
    </tr>

    <tr>
        <td align="right">妲己：</td>
        <td>
            <img src="green.png" height="10" width="${300*VoteResult["妲己"]/
            (VoteResult["上官"]+VoteResult["小乔"]+VoteResult["甄姬"]+VoteResult["貂蝉"])}/">
        </td>
        <td>(${empty VoteResult["妲己"]?0:VoteResult["妲己"]})</td>
    </tr>

    <tr>
        <td align="right">貂蝉：</td>
        <td>
            <img src="green.png" height="10" width="${300*VoteResult["貂蝉"]/
            (VoteResult["上官"]+VoteResult["小乔"]+VoteResult["甄姬"]+VoteResult["妲己"])}/">
        </td>
        <td>(${empty VoteResult["貂蝉"]?0:VoteResult["貂蝉"]})</td>
    </tr>

</table>
</body>
</html>
