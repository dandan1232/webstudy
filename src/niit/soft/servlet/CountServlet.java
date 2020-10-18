package niit.soft.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CountServlet",urlPatterns = "/homework/PeopleCount/count")
public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext=request.getServletContext();

        Integer count=(Integer) servletContext.getAttribute("count");
        if(count==null){
            servletContext.setAttribute("count",1);
        }else {
            servletContext.setAttribute("count",++count);
        }
        request.getRequestDispatcher("PeopleCount.jsp").forward(request,response);

    }

}

