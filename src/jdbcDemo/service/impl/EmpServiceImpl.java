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
    public Emp findById(int id) throws SQLException {
        Emp emp=null;
        emp=DaoFactory.getEmpDaoInstance().findById(id);
       return emp;
    }

    @Override
    public boolean updateById(Emp emp) throws SQLException {
        int result=0;
        result=DaoFactory.getEmpDaoInstance().updateById(emp.getId(),emp);
        if (result>0)
            return true;
        return false;
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


    @Override
    public List<Emp> findByName(String keywords) throws SQLException {
        List<Emp> empList=DaoFactory.getEmpDaoInstance().findByName(keywords);
        return empList;
    }
}
