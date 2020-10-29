package niit.soft.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "IndexFilter", urlPatterns = {"/indexServlet"})
public class IndexFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            chain.doFilter(req, resp);
        } else {
            out.println("您还没有登录");
            out.println("请点击<a href='/my005/login.html'>这里</a>进行登录");
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
