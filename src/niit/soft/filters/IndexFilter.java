//package niit.soft.filters;
//
//import niit.soft.beans.User;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.*;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebFilter(filterName = "IndexFilter", urlPatterns = {"/UserIndexServlet"})
//public class IndexFilter implements Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        System.out.println("indexFilter");
//        //PrintWriter out = resp.getWriter();
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response=(HttpServletResponse)resp;
//        Cookie[] cookies=request.getCookies();
//        String auto=null;
//        for (int i=0;cookies!=null&&i<cookies.length;i++){
//            if ("auto".equals(cookies[i].getName())){
//                auto=cookies[i].getValue();
//                break;
//            }
//        }
//        if (auto!=null){
//            String[] parts=auto.split("-");
//            String username=parts[0];
//            String password=parts[1];
//            if ("123".equals(password)){
//                User user=new User();
//                user.setAccount(username);
//                user.setPassword(password);
//                request.getSession().setAttribute("user",user);
//            }
//        }
//
//
//        chain.doFilter(request,response);
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
