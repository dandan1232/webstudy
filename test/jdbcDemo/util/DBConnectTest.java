package jdbcDemo.util;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectTest {

    @Test
    void getConnection() {
        Connection conn=DBConnect.getINitDBConnect().getConnection();
        if (conn!=null){
            System.out.println("数据库连接成功！");
        }
        DBConnect.getINitDBConnect().closeDB();
    }
}