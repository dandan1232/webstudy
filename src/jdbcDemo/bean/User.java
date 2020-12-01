package jdbcDemo.bean;

/**
 * @author 蛋宝
 * @date 2020/11/22 15:14
 * @description User
 */
public class User {
    private String head;
    private String name;
    private String password;

    public User(String head, String name, String password) {
        this.head = head;
        this.name = name;
        this.password = password;
    }

    public User(){
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "head='" + head + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
