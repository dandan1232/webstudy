package niit.soft.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class OnlineCountListener implements HttpSessionListener {
private Integer count=0;

@Override
    public void sessionCreated(HttpSessionEvent se){
    count++;
    ServletContext app=se.getSession().getServletContext();
    app.setAttribute("count",count);
    System.out.println("当前在线人数："+app.getAttribute("count"));
}
@Override
    public void sessionDestroyed(HttpSessionEvent se){
    count--;
    ServletContext app=se.getSession().getServletContext();
    app.setAttribute("count",count);
    System.out.println("当前在线人数："+app.getAttribute("count"));
}
}

