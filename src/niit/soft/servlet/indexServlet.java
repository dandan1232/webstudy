package niit.soft.servlet;

import niit.soft.beans.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "IndexServlet", urlPatterns = "/indexServlet")
public class indexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
    }
}
