package niit.soft.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet(name = "DanbaoServlet", description = "这是爷的第一个Servlet代码",
        urlPatterns = {"/my004/aaa", "/bbb"}, loadOnStartup = 1,
        initParams = {@WebInitParam(name = "NJNUIT", value = "南京工业职业技术大学", description = "南工院的简称与全称")}
)
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        PrintWriter out = response.getWriter();
        out.println("id：" + id);
        out.flush();
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /*response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","text/html;charset=utf-8");*/
        response.setContentType("text/html;charset=utf-8");
        //获取ServletCConfig实例化对象
        ServletConfig config=this.getServletConfig();
        //获取初始化参数
        String param=config.getInitParameter("NJNUIT");
        //获得servlet上下文对象
//        ServletContext context=config.getServletContext();
        ServletContext context=this.getServletContext();
        //获取servlet-context参数
        String parmContext=context.getInitParameter("email");
        //获得项目的实际路径
        String path=context.getRealPath("/");
        //获取此servlet的名字
        String servletName=config.getServletName();


        PrintWriter out = response.getWriter();
        /*response.setHeader("Content-Types", "text/html;charset='utf-8'");
        response.setContentType("text/html;charset='utf-8'");
        out.println("<html><head></head>");
        out.println("<body>");*/
        out.println("<h1>蛋宝的第一个servlet </h1>");
        out.println("获得的参数："+param+"<br>");
        out.println("项目的实际路径："+path+"<br>");
        out.println("此servlet的名字："+servletName+"<br>");
        out.println("获取的上下文参数为："+parmContext);
/*        out.println("</body>");
        out.println("</html>");*/
        out.flush();
        out.close();
    }
}
