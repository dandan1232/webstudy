package jdbcDemo.service;

import jdbcDemo.bean.Emp;

import java.sql.SQLException;
import java.util.List;

/**
 * @author admin
 * @date 2020/11/18 8:22
 * @description EmpService
 */
public interface EmpService {
    List<Emp> findAll() throws SQLException;
   int insert(Emp emp) throws SQLException;
   int deleteById(int id)throws  SQLException;
}
