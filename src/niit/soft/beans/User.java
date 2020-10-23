package niit.soft.beans;
//setter getter方法
//无参构造方法 有参构造方法
public class User {
    private String account;
    private String password;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
    public User(){

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
