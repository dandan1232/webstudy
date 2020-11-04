package niit.soft.servlet;

import niit.soft.beans.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginDoServlet", urlPatterns = "/loginDo")
public class LoginDoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//处理中文乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        HttpSession session = request.getSession();
        //获取系统产生的验证码
        String rand = (String) session.getAttribute("verifyCode");
    //获取表单信息
        String account=request.getParameter("account");
        String password=request.getParameter("password");
        String verifyCode=request.getParameter("verifyCode");

        if ("123".equals(password)&&rand.equals(verifyCode)){
            User user=new User(account,password);
            Cookie userInfo=new Cookie("auto",account+"-"+password);
            userInfo.setMaxAge(30*24*60*60);
            response.addCookie(userInfo);
            session.setAttribute("user",user);
            response.sendRedirect("/UserIndexServlet");
        }else {
            out.println("密码或验证码错误，请重新登录");
            out.println("<a href='/my005/login.html'>登录</a>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
