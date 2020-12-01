package jdbcDemo.service;
import jdbcDemo.bean.User;
import java.sql.SQLException;

public interface UserService {
    int addUser(User user)throws Exception;
    String getHead(String name) throws Exception;
    boolean getUser(String name,String password)throws SQLException;

}
