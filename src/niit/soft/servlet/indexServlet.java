package niit.soft.servlet;

import niit.soft.beans.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IndexServlet", urlPatterns = "/indexServlet")
public class indexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*     HttpSession session=request.getSession();
     User user=(User)session.getAttribute("user");

     PrintWriter out=response.getWriter();
        out.println("欢迎您," + user.getAccount() + "!");
        out.println("<a href='/layoutServlet'>退出</a>");*/
        doGet(request, response);


      /*  response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            out.println("您还没有登录，点击<a href='/my005/login.html'>这里</a>登录");
        } else {
            out.println("欢迎您," + user.getAccount() + "!");
            out.println("<a href='/layoutServlet'>退出</a>");
        }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String autoLogin=request.getParameter("autologin");



        if ("123".equals(username) && "123".equals(password)) {
            User user = new User();
            user.setAccount(username);
            user.setPassword(password);
            request.getSession().setAttribute("user", user);
            if (autoLogin != null) {
                Cookie cookie = new Cookie("autologin", username + "-" + password);
                cookie.setMaxAge(Integer.parseInt(autoLogin));
                cookie.setPath(request.getContextPath());
                response.addCookie(cookie);
                response.sendRedirect("/my004/errorLogin.jsp");
            } else {
                request.setAttribute("error", "用户名密码错误");
                request.getRequestDispatcher("/my004/login.jsp").forward(request, response);
            }
        }


/*
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        String autoLogin=request.getParameter("auto");
        if("123".equals(name) && "123".equals(pwd)){
            if("on".equals(autoLogin)){
                Cookie cookie=new Cookie("name","123");
                cookie.setMaxAge(Integer.parseInt(autoLogin));//有效期为一个星期
                response.addCookie(cookie);
                request.setAttribute("name",name);
                request.getRequestDispatcher("user.view").forward(request, response);
            }
        }else{
            response.sendRedirect("login.jsp");
        }*/

    }
}
