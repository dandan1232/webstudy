package niit.soft.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "EncodingFilter",urlPatterns = {"/*","/my004/*"},description = "字符编码过滤器",
initParams = {@WebInitParam(name = "encoding",value = "utf-8")})
public class EncodingFilter implements Filter {
    private String encoding=null;
    public void destroy() {
        this.encoding=null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       //设定字符编码情况
        req.setCharacterEncoding(this.encoding);
       resp.setContentType("text/html;charset="+this.encoding);
        System.out.println("encodingFilter");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.encoding=config.getInitParameter("encoding");
    }

}
