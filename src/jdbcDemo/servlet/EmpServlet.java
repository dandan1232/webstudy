package jdbcDemo.servlet;
import jdbcDemo.bean.Emp;
import jdbcDemo.dao.EmpDao;
import jdbcDemo.factory.ServiceFactory;
import jdbcDemo.impl.EmpDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmpServlet",urlPatterns ={ "/emp/empShowAll","/emp/do_insert"})
public class EmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Emp> list= ServiceFactory.getEmpServiceInstance().findAll();
            request.setAttribute("emplist",list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    /*    String path="show.jsp";*/
        String path="showPages.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
