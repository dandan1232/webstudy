package niit.soft.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "sumOrProductServlet", urlPatterns = "/homework/Addmul/sumOrProduct")
public class sumOrProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String data = request.getParameter("data");
        String[] split = data.split(";");
        int sum = 0;
        for (String num : split) {
            sum += Integer.parseInt(num);
        }
        request.setAttribute("data", sum);
        RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=uft-8");
        String data = request.getParameter("data");
        String[] split = data.split(";");
        int sum = 1;
        for (String num : split) {
            sum *= Integer.parseInt(num);
        }
        request.setAttribute("data", sum);
        RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
        rd.forward(request, response);
    }
}
