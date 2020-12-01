package jdbcDemo.servlet;

import jdbcDemo.bean.Emp;
import jdbcDemo.bean.User;
import jdbcDemo.factory.ServiceFactory;

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

@WebServlet(name = "EmpServlet", urlPatterns = {"/emp/empServlet"})
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
        String action = request.getParameter("action");
        if ("showAll".equals(action)) {
            showAll(request, response);
        } else if ("insert".equals(action)) {
            insert(request, response);
        } else if ("deleteById".equals(action)) {
            deleteById(request, response);
        } else if ("modifyById".equals(action)){
            modifyById(request,response);
        }else if ("saveModify".equals(action)) {
            saveModify(request, response);
        }/* else if ("update".equals(action)) {
            update(request, response);
        }*/ else if ("showByName".equals(action)) {
            showByName(request, response);
        } else if ("showById".equals(action)) {
            showById(request, response);
        } else if ("login".equals(action)) {
            login(request, response);
        } else if ("register".equals(action)) {
            try {
                register(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    protected void saveModify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String job=request.getParameter("job");
        double sal=Double.parseDouble(request.getParameter("sal"));
        Emp emp=new Emp(id,name,job,sal);
        try {
             if(ServiceFactory.getEmpServiceInstance().updateById(emp)){
                response.getWriter().println("<script language=javascript> alert('修改成功！');" +
                        "window.location.href='index.jsp';</script>");
             }else{
                response.getWriter().println("<script language=javascript> alert('修改失败！');" +
                        "window.location.href='index.jsp';</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected void modifyById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        try {
            Emp emp=ServiceFactory.getEmpServiceInstance().findById(id);
            request.setAttribute("emp",emp);
            String path="modify.jsp";
            request.getRequestDispatcher(path).forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            ServiceFactory.getEmpServiceInstance().deleteById(id);
            response.getWriter().println("<script language=javascript>" + "alert('删除成功');window.location.href='index.jsp';" +
                    "</script>");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("<script language=javascript>" + "alert('删除失败');window.location.href='index.jsp';" +
                    "</script>");
        }

    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String job = request.getParameter("job");
        Double sal = Double.parseDouble(request.getParameter("sal"));
        Emp emp = new Emp(name, job, sal);
        PrintWriter out = response.getWriter();
        try {
            ServiceFactory.getEmpServiceInstance().insert(emp);
            out.println("<script language=javascript>alert('增加成功');"
                    + "window.location.href='index.jsp';</script>");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<script language=javascript>alert('增加失敗');"
                    + "window.location.href='index.jsp';</script>");
        }
        out.flush();
        out.close();
    }

    protected void showAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try {
            List<Emp> emplist = ServiceFactory.getEmpServiceInstance().findAll();
            session.setAttribute("emplist", emplist);
            String path = "showPages.jsp";
            response.sendRedirect(path);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("出错了");
        }
    }

    protected void showById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            Emp emplist = ServiceFactory.getEmpServiceInstance().findById(id);
            session.setAttribute("emp", emplist);
            if (emplist!=null){
                String path ="SearchPages.jsp";
/*                String path="showPages.jsp";*/
                response.sendRedirect(path);
            }else{
               response.getWriter().println("<script language=javascript>alert('查无此编号');"
                        + "window.location.href='index.jsp';</script>");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("出错了");
        }
    }

    protected void showByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        try {
            List<Emp> empList = ServiceFactory.getEmpServiceInstance().findByName(name);
            session.setAttribute("emplist", empList);
            if (!empList.isEmpty()) {
                String path = "showPages.jsp";
                response.sendRedirect(path);
            }else {
                response.getWriter().println("<script language=javascript>alert('查无此名称');"
                        + "window.location.href='index.jsp';</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("出错了");
        }
    }

/*    protected void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String job = request.getParameter("job");
        double sal = Double.parseDouble(request.getParameter("sal"));
        int id = Integer.parseInt(request.getParameter("id"));
        Emp emp = new Emp(id, name, job, sal);
        try {
            ServiceFactory.getEmpServiceInstance().updateById(id, emp);
            response.getWriter().println("<script language=javascript>"
                    + "alert('修改成功');" + "window.location.href='Empindex.jsp'" + "</script>");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("<script language=javascript>"
                    + "alert('修改失败');" + "window.location.href='Empindex.jsp'" + "</script>");
        }
    }*/

    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            boolean flag = ServiceFactory.getUserServiceInstance().getUser(name, password);
            if (flag) {
                response.getWriter().println("<script language=javascript>" + "alert('登陆成功');"
                        + "window.location.href='index.jsp';" + "</script>");
            } else {
                response.getWriter().println("<script language=javascript>" + "alert('出错了，请重新登录或注册');"
                        + "window.location.href='login.jsp';" + "</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }
  /*  protected void register(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String avatar=request.getParameter("image");
        String name = request.getParameter("username");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        try {
            if (password1.equals(password2)) {
                User user = new User(avatar,name,password1);
                ServiceFactory.getUserServiceInstance().addUser(user);
                request.getSession().setAttribute("avatar",avatar);
                response.getWriter().println("<script language=javascript>" +
                        "alert('注册成功');" + "window.location.href='index.jsp';"
                        + "</script>");
                *//*            request.getRequestDispatcher("index.jsp").forward(request,response);*//*
            } else {
                response.getWriter().println("<script language=javascript>" +
                        "alert('注册失败，两次密码不同');" +
                        "window.location.href='register.jsp';" +
                        "</script>");
            }
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error");
        }

    }*/
    protected void register(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String avatar = request.getParameter("image");
        String name = request.getParameter("username");
        String pw1 = request.getParameter("pw1");
        String pw2 = request.getParameter("pw2");
        if (pw1.equals(pw2)){
            User user = new User(avatar,name,pw1);
            ServiceFactory.getUserServiceInstance().addUser(user);
            request.getSession().setAttribute("avatar",avatar);
            response.getWriter().println("<script language=javascript>" +
                    "alert('注册成功');" + "window.location.href='index.jsp';" +
                    "</script>");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else {
            response.getWriter().println("<script language=javascript>" +
                    "alert('注册失败，两次密码不同');" +
                    "window.location.href='register.jsp';" +
                    "</script>");
        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
