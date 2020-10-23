package niit.soft.servlet;

import niit.soft.beans.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IndexServlet",urlPatterns = "/indexServlet")
public class indexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=utf-8");
        HttpSession session=request.getSession();
        PrintWriter out=response.getWriter();
        User user=(User)session.getAttribute("user");
        if (user==null){
            out.println("您还没有登录，点击<a href='/my005/login.html'>这里</a>登录");
        }else{
            out.println("欢迎您,"+user.getAccount()+"!");
            out.println("<a href='/layoutServlet'>退出</a>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
