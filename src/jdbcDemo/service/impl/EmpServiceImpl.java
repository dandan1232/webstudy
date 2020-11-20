package jdbcDemo.service.impl;

import jdbcDemo.bean.Emp;
import jdbcDemo.factory.DaoFactory;
import jdbcDemo.service.EmpService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author admin
 * @date 2020/11/18 8:24
 * @description EmpServiceImpl
 */
public class EmpServiceImpl implements EmpService {
    @Override
    public List<Emp> findAll() throws SQLException {
        List<Emp> empList = DaoFactory.getEmpDaoInstance().findAll();
        return empList;

    }

    @Override
    public int insert(Emp emp) throws SQLException {
        int effectLine = DaoFactory.getEmpDaoInstance().insert(emp);
        return effectLine;
    }

    @Override
    public int deleteById(int id) throws SQLException {
        int effectLine=DaoFactory.getEmpDaoInstance().deleteById(id);
        return effectLine;
    }
}
