package jdbcDemo.dao;

import jdbcDemo.bean.Emp;

import java.sql.SQLException;
import java.util.List;

/**
 * @author admin
 * @date 2020/11/11 10:52
 * @description EmpDao
 */
public interface EmpDao {
    /*查询所有的信息*/
    List<Emp> findAll() throws SQLException;
    /*根据姓名查询*/
    List<Emp> findByName(String keywords)throws SQLException;
    /*根据id查询*/
    Emp findById(int id) throws SQLException;
    /*根据id修改信息*/
    int updateById(int id,Emp emp)throws SQLException;
    /*增加操作*/
    int insert(Emp emp)throws SQLException;
    /*根据id删除*/
    int deleteById(int id) throws  SQLException;
}
