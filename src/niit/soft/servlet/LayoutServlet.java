package niit.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LayoutServlet",urlPatterns = "/layoutServlet")
public class LayoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理中文乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=uft-8");

        HttpSession session=request.getSession();
        session.removeAttribute("user");
        response.sendRedirect("/my005/login.html");
    //session.invalidate();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
