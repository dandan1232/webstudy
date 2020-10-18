<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/24
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
<%!
    int count;
    StringBuffer personList;
    public void judge(){
        if(count==0) {
            personList = new StringBuffer();
        }
    }
    public void addPerson(String name){
        if (count==0){
            personList.append(name);
        }else{
            personList.append("，"+name);
        }
        count++;
    }
%>
<%
    String name=request.getParameter("name");
    if (name.length()==0||name.length()>10){
%>
<html page="inputName.jsp">
    <%
        }
    judge();
    addPerson(name);
%>
有<%=count%>人在名单，名单为<%=personList%>
</body>
</html>