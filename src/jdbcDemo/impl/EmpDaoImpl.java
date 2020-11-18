package jdbcDemo.impl;

import jdbcDemo.bean.Emp;
import jdbcDemo.dao.EmpDao;
import jdbcDemo.util.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @date 2020/11/11 10:57
 * @description EmpDaoImpl
 */
public class EmpDaoImpl implements EmpDao {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private String sql;

    @Override
    public List<Emp> findAll() throws SQLException {
        conn = DBConnect.getINitDBConnect().getConnection();
        sql = "SELECT * FROM tb_emp";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        List<Emp> empList = new ArrayList<>();
        while (rs.next()) {
            // Emp emp=new Emp()
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String job = rs.getString("job");
            double sal = rs.getDouble(4);
            Emp emp = new Emp(id, name, job, sal);
            empList.add(emp);
        }
        rs.close();
        pstmt.close();
        conn.close();
        return empList;
    }

    @Override
    public List<Emp> findByName(String keywords) throws SQLException {
        return null;
    }

    @Override
    public Emp findById(String id) throws SQLException {
        return null;
    }

    @Override
    public int updateById(int id, Emp emp) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Emp emp) throws SQLException {
        int effectLine=0;
        conn=DBConnect.getINitDBConnect().getConnection();
        sql="INSERT INTO tb_emp(id,name,job,sal) VALUES(id,?,?,?)";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,emp.getName());
        pstmt.setString(2,emp.getJob());
        pstmt.setDouble(3,emp.getSal());
        effectLine=pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return effectLine;
    }

    @Override
    public int deleteById(int id) throws SQLException {
        return 0;
    }
}
