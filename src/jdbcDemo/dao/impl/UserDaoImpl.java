package jdbcDemo.dao.impl;

import jdbcDemo.bean.User;
import jdbcDemo.dao.UserDao;
import jdbcDemo.util.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 蛋宝
 * @date 2020/11/22 15:55
 * @description UserDaoImpl
 */
public class UserDaoImpl implements UserDao {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private String sql;


    @Override
    public int addUser(User user) throws SQLException {
        int effectLine = 0;
        conn = DBConnect.getINitDBConnect().getConnection();
        sql = "INSERT INTO tb_user(id,head,name,password) VALUES(id,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,user.getHead());
        pstmt.setString(2, user.getName());
        pstmt.setString(3, user.getPassword());
        effectLine = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return effectLine;
    }

    @Override
    public String getHead(String name) throws SQLException {
        conn = DBConnect.getINitDBConnect().getConnection();
        sql = "SELECT head FROM tb_user WHERE name=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        rs = pstmt.executeQuery();
        String head = null;
        while (rs.next()) {
            head = rs.getString(1);
        }
        return head;
    }

    @Override
    public boolean getUser(String name, String password) throws SQLException {
        boolean flag = false;
        try {
            conn = DBConnect.getINitDBConnect().getConnection();
            sql="SELECT * FROM tb_user WHERE name=? and password=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                flag = true;
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
