package niit.soft.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "MyfirstFilter",urlPatterns = "/my004/aaa")
public class MyfirstFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.println("这是爷过滤器中的数据，而非MyServlet的数据");
        System.out.println("myFirstFilter");
        chain.doFilter(req, resp);  //有它传递 没它拦截
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
