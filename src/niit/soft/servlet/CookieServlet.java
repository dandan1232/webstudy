package niit.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CookieServlet",urlPatterns = "/getCookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        Cookie[] cookies=request.getCookies();
/*     for (Cookie c:cookies){
         out.println(c.getName()+"--->"+c.getValue());
        }*/
//Lambda表达式输出
        Arrays.asList(cookies).forEach(c ->out.println(c.getName()+"--->"+c.getValue()+"<br>") );

        List list=new ArrayList();
        list.add("abc");
        list.add("bcd");
        list.add("cde");
      //  list.forEach(out::println);
      //  list.forEach((c)->out.println(c));

        Cookie cookie01=new Cookie("soft","软件1921");
        Cookie cookie02=new Cookie("NIIT","南工院");
        cookie01.setMaxAge(2);
        response.addCookie(cookie01);
        response.addCookie(cookie02);

        HttpSession session=request.getSession();
        out.println("SessionID="+session.getId());

        out.flush();
        out.close();
    }
}
