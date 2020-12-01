<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020-11-26
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
</head>
<body>
<div class="row">
    <div class="col-3"></div>
    <div class="col-6 p-5">
        <form action="empServlet?action=register" method="post" class="pt-lg-5 ">
            <h3 class="text-center text-primary bg-light mb-5">账号注册</h3>
            <br>
            <div class="form-group row pl-3 mb-4">
                <label for="account" class="col-4 text-right bg-light mr-3 mb-0" style="font-size: 20px">账号：</label>
                <input type="text" class="col-7" name="username" id="account">
            </div>

            <div class="form-group row pl-3 mb-4">
                <label for="avatar" class="col-4 text-right bg-light mr-3  mb-0 pt-2"
                       style="font-size: 20px">头像：</label>
                <%--                请选择头像:<input type="file" name="head"><br><br>--%>
                <select name="image" class="mr-2"
                        onchange="document.images['avatar'].src=options[selectedIndex].value;">
                    <option value="../upload/001.jpg">001</option>
                    <option value="../upload/002.jpg">002</option>
                    <option value="../upload/003.jpg">003</option>
                    <option value="../upload/004.jpg">004</option>
                    <option value="../upload/005.jpg">005</option>
                    <option value="../upload/006.jpg">006</option>
                    <option value="../upload/007.jpg">007</option>
                    <option value="../upload/008.jpg">008</option>
                    <option value="../upload/009.gif">009</option>
                    <option value="../upload/010.jpg">010</option>
                </select>
                <img src="../upload/001.jpg" alt="头像" name="avatar" id="avatar" class="img-circle img-responsive"
                     height="40" width="40">
            </div>

            <div class="form-group row pl-3 mb-4">
                <label for="password" class="col-4 text-right bg-light mr-3  mb-0" style="font-size: 20px">密码：</label>
                <input type="password" class="col-7 " name="pw1" id="password">
            </div>

            <div class="form-group row pl-3 mb-4">
                <label for="confirmpassword" class="col-4 text-right bg-light mr-3  mb-0"
                       style="font-size: 20px">确认密码：</label>
                <input type="password" class="col-7" name="pw2" id="confirmpassword">
            </div>

            <div class="form-group row">
                <div class="col-4">
                    <button type="reset" class="btn btn-block btn-primary">
                        重置
                    </button>
                </div>

                <div class="col-4">
                        <button type="submit" class="btn btn-block btn-dark">
                            注册
                        </button>
                </div>

                <div class="col-4">
                    <a href="/emp/login.jsp" class="btn btn-block btn-success">
                        登录
                    </a>
                </div>
            </div>
        </form>
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
