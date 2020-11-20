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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmpServlet",urlPatterns ={"/emp/empServlet"})
public class EmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*        try {
            List<Emp> list= ServiceFactory.getEmpServiceInstance().findAll();
            request.setAttribute("emplist",list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    *//*    String path="show.jsp";*//*
        String path="showPages.jsp";
        request.getRequestDispatcher(path).forward(request,response);*/
        String action=request.getParameter("action");
        if ("showAll".equals(action)){
            showAll(request,response);
        }else if ("insert".equals(action)){
            insert(request,response);
        }else if("deleteById".equals(action)){
            deleteById(request,response);
        }
    }

    private void deleteById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        try {
            ServiceFactory.getEmpServiceInstance().deleteById(id);
            response.getWriter().println("<script language=javascript>"+"alert('删除成功');window.location.href='index.jsp';"+
                    "</script>");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("<script language=javascript>"+"alert('删除失败');window.location.href='index.jsp';"+
                    "</script>");
        }

    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String name=request.getParameter("name");
            String job=request.getParameter("job");
            Double sal=Double.parseDouble(request.getParameter("sal"));
            Emp emp=new Emp(name,job,sal);
        PrintWriter out=response.getWriter();
        try {
            ServiceFactory.getEmpServiceInstance().insert(emp);
            out.println("<script language=javascript>gialert('增加成功');"
                    +"window.location.href='index.jsp';</script>");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<script language=javascript>alert('增加失敗');"
                    +"window.location.href='index.jsp';</script>");
        }
        out.flush();
        out.close();
    }

    protected void showAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        try {
            List<Emp> emplist=ServiceFactory.getEmpServiceInstance().findAll();
            session.setAttribute("emplist",emplist);
            String path="showPages.jsp";
            response.sendRedirect(path);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
