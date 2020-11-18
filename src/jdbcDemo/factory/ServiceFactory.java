package jdbcDemo.factory;

import jdbcDemo.service.EmpService;
import jdbcDemo.service.impl.EmpServiceImpl;

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
}
