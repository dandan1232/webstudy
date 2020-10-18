package niit.soft.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/my004/doLogin")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String psd = request.getParameter("psd");
//        System.out.println("name:"+name+"psd:"+psd);
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        if ("123".equals(psd)) {
            //保存用户名
            session.setAttribute("name",name);
            //实现跳转
            response.sendRedirect("welcome.jsp");
        } else {
            request.setAttribute("name",name);
/*            RequestDispatcher rd=request.getRequestDispatcher("errorLogin.jsp");*/
            RequestDispatcher rd=request.getRequestDispatcher("/bbb"); //绝对路径,以/打头
           // RequestDispatcher rd=request.getRequestDispatcher("aaa"); //相对路径，无/
           rd.forward(request,response);


            /* out.println("<h1>用户名或密码错误,5秒之后跳转到登录页面</h1>");
            response.setHeader("refresh", "5;url=Login.jsp");*/
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
