package jdbcDemo.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdbcDemo.bean.Emp;
import jdbcDemo.dao.EmpDao;
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