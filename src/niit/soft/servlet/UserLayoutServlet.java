package niit.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "UserLayoutServlet", urlPatterns = "/userLayoutServlet")
public class UserLayoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //删除指定用户
        session.removeAttribute("user");
        //强制无效
        session.invalidate();

        //清除cookie
        Cookie cookie = new Cookie("auto", "msg");
        cookie.setPath(request.getContextPath());
        cookie.setMaxAge(0);
        response.sendRedirect("my005/login.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
