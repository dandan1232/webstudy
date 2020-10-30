package niit.soft.beans;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

//setter getter方法
//无参构造方法 有参构造方法
public class User implements HttpSessionBindingListener {
    private String account;
    private String password;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        String name = event.getName();
        System.out.println("User类创建的对象被添加到会话中：" + name + "==>" +
                event.getSession().getAttribute(name));
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        String name = event.getName();
        System.out.println("User类创建的对象从会话中销毁：" + name);
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public User() {

    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
