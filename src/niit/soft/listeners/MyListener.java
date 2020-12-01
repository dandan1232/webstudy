//package niit.soft.listeners;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//import javax.servlet.http.HttpSessionAttributeListener;
//import javax.servlet.http.HttpSessionEvent;
//import javax.servlet.http.HttpSessionListener;
//import javax.servlet.http.HttpSessionBindingEvent;
//
//@WebListener()
//public class MyListener implements ServletContextListener,
//        HttpSessionListener, HttpSessionAttributeListener {
//
//    // Public constructor is required by servlet spec
//    public MyListener() {
//    }
//
//    // -------------------------------------------------------
//    // ServletContextListener implementation
//    // -------------------------------------------------------
//    public void contextInitialized(ServletContextEvent sce) {
//        System.out.println("Application对象被创建");
//    }
//
//    public void contextDestroyed(ServletContextEvent sce) {
//        System.out.println("Application对象被销毁");
//    }
//
//    // -------------------------------------------------------
//    // HttpSessionListener implementation
//    // -------------------------------------------------------
//    public void sessionCreated(HttpSessionEvent se) {
//       String sessionID=se.getSession().getId();
//        System.out.println("Session对象被创建，sessionID:"+sessionID);
//    }
//
//    public void sessionDestroyed(HttpSessionEvent se) {
//        se.getSession().invalidate();
//        System.out.println("Session对象被销毁");
//    }
//
//    // -------------------------------------------------------
//    // HttpSessionAttributeListener implementation
//    // -------------------------------------------------------
//
//    public void attributeAdded(HttpSessionBindingEvent sbe) {
//    String name=sbe.getName();
//        System.out.println("Session范围对象被创建:"+name+"="+sbe.getSession().getAttribute(name));
//    }
//
//    public void attributeRemoved(HttpSessionBindingEvent sbe) {
//     String name=sbe.getName();
//        System.out.println("Session范围对象被修改:"+name+"="+sbe.getSession().getAttribute(name));
//    }
//
//    public void attributeReplaced(HttpSessionBindingEvent sbe) {
//    String name=sbe.getName();
//        System.out.println("Session范围对象销毁:"+name);
//    }
//}
