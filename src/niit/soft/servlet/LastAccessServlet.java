package niit.soft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "LastAccessServlet", urlPatterns = "/LastAccessTime")
public class LastAccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String lastAccessTime = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if ("lastAccess".equals(c.getName())) {
                lastAccessTime = URLDecoder.decode(c.getValue(), "utf-8"); //解码，解密
                break;
            }
        }

        if (lastAccessTime == null) {
            out.println("您是首次访问本网站");
        } else {
            out.println("您上次访问本网页的时间为：" + lastAccessTime);
        }

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String now = df.format(LocalDateTime.now());
        Cookie cookie = new Cookie("lastAccess", URLEncoder.encode(now, "utf-8")); //加密
        response.addCookie(cookie);
    }
}
