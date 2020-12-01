package jdbcDemo.factory;

import jdbcDemo.service.EmpService;
import jdbcDemo.service.UserService;
import jdbcDemo.service.impl.EmpServiceImpl;
import jdbcDemo.service.impl.UserServiceImpl;
import java.sql.SQLException;

/**
 * @author admin
 * @date 2020/11/18 8:27
 * @description ServiceFactory
 */
public class ServiceFactory {
    public static EmpService getEmpServiceInstance() throws SQLException{
        return new EmpServiceImpl();
    }

    public static UserService getUserServiceInstance() throws SQLException{
        return new UserServiceImpl();
    }
}
