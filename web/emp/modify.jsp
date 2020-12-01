<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/11/25
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息修改</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6">
            <form action="empServlet?action=saveModify" method="post">
                <div class="text-center text-primary">
                    员工信息修改
                </div>
                <br>
                id：<input name="id" class="form-control" value="${emp.id}" readonly> <br>
                姓名： <input type="text" name="name" class="form-control" value="${emp.name}"><br>
                工作：<input type="text" name="job" class="form-control" value="${emp.job}"><br>
                工资：<input type="text" name="sal" class="form-control" value="${emp.sal}"><br>

                <button type="submit" class="btn btn-primary btn-block">
                    修改
                </button>
                <br>
                <button type="button" class="btn btn-dark btn-block" onclick="window.history.back(1);">
                    返回
                </button>

            </form>
        </div>

    </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
        integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>
</body>
</html>
