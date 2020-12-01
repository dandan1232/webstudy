package jdbcDemo.factory;

import jdbcDemo.dao.EmpDao;
import jdbcDemo.dao.UserDao;
import jdbcDemo.dao.impl.EmpDaoImpl;
import jdbcDemo.dao.impl.UserDaoImpl;

import java.sql.SQLException;

/**
 * @author admin
 * @date 2020/11/18 8:14
 * @description DaoFactory
 */
public class DaoFactory {
    public static EmpDao getEmpDaoInstance() throws SQLException{
        return new EmpDaoImpl();
    }
    public static UserDao getUserDaoInstance() throws SQLException{
        return new UserDaoImpl();
    }

}

