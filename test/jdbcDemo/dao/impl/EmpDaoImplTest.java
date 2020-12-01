package jdbcDemo.dao.impl;

import jdbcDemo.bean.Emp;
import jdbcDemo.dao.EmpDao;
import jdbcDemo.factory.DaoFactory;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpDaoImplTest {

    EmpDao empDao=new EmpDaoImpl();
    @Test
    void findAll() {
        try {
            List<Emp> list = empDao.findAll();
            list.forEach(emp -> System.out.println(emp));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void findByName() {
    }

    @Test
    void findById() {
        int id=30;
        try {
            Emp emp= DaoFactory.getEmpDaoInstance().findById(id);
            if (emp==null){
                System.out.println("无此id"+id+"的员工信息不存在");
            }else{
                System.out.println(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void updateById() {
    }

    @Test
    void insert()  {
        Emp emp=new Emp("aaa","bbb",1000);
        try {
            int effectLine=empDao.insert(emp);
            assertEquals(1,effectLine);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Test
    void deleteById() {
    }
}